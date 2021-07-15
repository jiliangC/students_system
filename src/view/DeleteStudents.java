package view;
import main_information.Set_Table;
import main_information.String_Function;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;


public class DeleteStudents extends JFrame {
    JTable table;
    public static void main(String[] args){new DeleteStudents(null);}
    public DeleteStudents(JTable table) {
        this.table=table;
        setVisible(true);
        setTitle("删除学生信息");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }

    private void deleteActionPerformed(ActionEvent e) {
        String number = textField1.getText();
        int index=-1;
        String_Function string_function = new String_Function();
        String[][] strings = string_function.get_s();
        for (int i=0;i<strings.length;i++){
            if (strings[i][0].equals(number)){
                index=1;
                int is_delete = JOptionPane.showConfirmDialog(null,"是否删除该学生信息","注意",JOptionPane.YES_NO_OPTION);
                if (is_delete==JOptionPane.YES_OPTION){
                    string_function.delete(i);
                    new Set_Table(table,string_function.get_s(),0);
                    dispose();
                }
                break;
            }
        }
        if (index==-1){
            JOptionPane.showMessageDialog(null,"未找到该学生信息");
        }



        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textField1 = new JTextField();
        label1 = new JLabel();
        delete = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- textField1 ----
        textField1.setOpaque(false);
        contentPane.add(textField1);
        textField1.setBounds(85, 60, 150, 25);

        //---- label1 ----
        label1.setText("\u5b66\u53f7");
        contentPane.add(label1);
        label1.setBounds(45, 60, 30, 25);

        //---- delete ----
        delete.setText("\u5220\u9664");
        delete.addActionListener(e -> deleteActionPerformed(e));
        contentPane.add(delete);
        delete.setBounds(45, 105, 190, 25);

        contentPane.setPreferredSize(new Dimension(280, 190));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        delete.setContentAreaFilled(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField textField1;
    private JLabel label1;
    private JButton delete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
