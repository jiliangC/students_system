/*
 * Created by JFormDesigner on Sun Jul 11 10:39:22 AWST 2021
 */

package view;

import main_information.Str_information;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author unknown
 */
public class DeleteStudents extends JFrame {
    public static void main(String[] args){new DeleteStudents();}
    public DeleteStudents() {
        setVisible(true);
        setTitle("删除学生信息");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
    }

    private void deleteActionPerformed(ActionEvent e) {
        boolean judge=false;
        int index=-1;
        String number = textField1.getText();
        Str_information str_information = new Str_information();
        ArrayList<String[]> strings = str_information.get_s();

        for (String[] strings1:strings){
            if (strings1[0].equals(number)){
                index=strings.indexOf(strings1);
                int is_delete=JOptionPane.showConfirmDialog(null,"是否删除该学生信息","注意",JOptionPane.YES_NO_OPTION);
                if (is_delete==JOptionPane.YES_OPTION){ //同意
                    strings.remove(index);
                    str_information.replace(strings);
                    dispose();
                }
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
