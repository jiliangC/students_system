package view;

import main_information.Revise_things;
import main_information.Set_Table;
import main_information.String_Function;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

public class Revise extends JFrame {
    JTable table;
    public static void main(String[] args) {
        new Revise(null);
    }
    public Revise(JTable table) {
        this.table = table;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("修改学生信息");
        setVisible(true);
        initComponents();
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }


    Revise_things revise_things = new Revise_things();
    private void button1ActionPerformed(ActionEvent e) {
        String number = textField1.getText();
        String[][] str_s = revise_things.search(number);
        new Set_Table(table1,str_s,1);

        // TODO add your code here
    }
    //here have bug
    private void change(){
        int index= table1.getSelectedRow();
        String[] new_information = new String[7];
        for (int i=0;i<7;i++){
            new_information[i] = table1.getValueAt(index,i).toString();
        }
        int k = revise_things.set_information(new_information,index);
        if (k==1){
            JOptionPane.showMessageDialog(null,"学生信息修改成功");
            String_Function string_function = new String_Function();
            new Set_Table(table, string_function.get_s(), 0);
        }
        System.out.println(Arrays.toString(new_information));
    }
    private void button2ActionPerformed(ActionEvent e) {
        if (table1.getCellEditor()!=null) {
            table1.getCellEditor().stopCellEditing();
        }
        change();
        // TODO add your code here
    }





    private void initComponents() {

        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u5b66\u53f7");
        contentPane.add(label1);
        label1.setBounds(185, 30, 40, 25);

        //---- textField1 ----
        textField1.setOpaque(false);
        contentPane.add(textField1);
        textField1.setBounds(225, 30, 120, 25);

        //---- button1 ----
        button1.setText("\u67e5\u627e");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(385, 30, button1.getPreferredSize().width, 25);

        //======== scrollPane1 ========
        {

            //---- table1 ----

            table1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                    new String[]{
                            "学号", "姓名", "性别", "语文", "数学", "英语", "总分"
                    }
            ));
            {
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(0).setResizable(false);
                cm.getColumn(1).setResizable(false);
                cm.getColumn(2).setResizable(false);
                cm.getColumn(3).setResizable(false);
                cm.getColumn(4).setResizable(false);
                cm.getColumn(5).setResizable(false);
                cm.getColumn(6).setResizable(false);
            }
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(40, 70, 525, 145);

        //---- button2 ----
        button2.setText("\u4fdd\u5b58");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(40, 225, 525, 25);

        contentPane.setPreferredSize(new Dimension(605, 300));
        pack();
        setLocationRelativeTo(getOwner());
        button1.setContentAreaFilled(false);
        button2.setContentAreaFilled(false);
    }


    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button2;

}
