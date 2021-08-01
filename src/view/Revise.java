package view;

import main_information.Revise_things;
import main_information.Set_Table;
import main_information.String_Function;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.*;
import javax.swing.table.*;

public class Revise extends JFrame {
    JTable table; //Main的table
    private JTextField num_text;
    private JTable table1;

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

    private void search() {
        String number = num_text.getText();
        String[][] str_s = revise_things.search(number);
        new Set_Table(table1, str_s, 1);

        // TODO add your code here
    }

    private void save() {
        if (table1.getCellEditor() != null) {
            table1.getCellEditor().stopCellEditing();
        }
        int index = table1.getSelectedRow();
        String[] new_information = new String[7];
        for (int i = 0; i < 7; i++) {
            new_information[i] = table1.getValueAt(index, i).toString();
        }
        int k = revise_things.set_information(new_information, index);
        if (k == 1) {
            JOptionPane.showMessageDialog(null, "学生信息修改成功");
            String_Function string_function = new String_Function();
            new Set_Table(table, string_function.get_s(), 0);
        }
        System.out.println(Arrays.toString(new_information));
        // TODO add your code here
    }

    private void initComponents() {

        JLabel num_label = new JLabel();
        num_text = new JTextField();
        JButton Search_button = new JButton();
        JScrollPane scrollPane1 = new JScrollPane();
        table1 = new JTable();
        JButton Sava_button = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- num_label ----
        num_label.setText("学号");
        contentPane.add(num_label);
        num_label.setBounds(185, 30, 40, 25);

        //---- num_text ----
        num_text.setOpaque(false);
        contentPane.add(num_text);
        num_text.setBounds(225, 30, 120, 25);

        //---- Search_button ----
        Search_button.setText("查找");
        Search_button.addActionListener(e -> search());
        contentPane.add(Search_button);
        Search_button.setBounds(385, 30, Search_button.getPreferredSize().width, 25);

        //======== scrollPane1 ========
        {
            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                    new Object[][]{
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

        //---- Sava_button ----
        Sava_button.setText("保存");
        Sava_button.addActionListener(e -> save());
        contentPane.add(Sava_button);
        Sava_button.setBounds(40, 225, 525, 25);

        contentPane.setPreferredSize(new Dimension(605, 300));
        pack();
        setLocationRelativeTo(getOwner());
        Search_button.setContentAreaFilled(false);
        Sava_button.setContentAreaFilled(false);
    }
}
