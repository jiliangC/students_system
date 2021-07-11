/*
 * Created by JFormDesigner on Sun Jul 11 23:24:48 AWST 2021
 */

package view;

import main_information.Revise_things;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author unknown
 */
public class Revise extends JFrame {
    public static void main(String[] args) {
        new Revise();
    }
    public Revise() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("修改学生信息");
        setVisible(true);
        initComponents();
    }

    private void set_table(String[][] str_s) {

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//单元格渲染器
        tcr.setHorizontalAlignment(JLabel.CENTER);//居中显示
        table1.setDefaultRenderer(Object.class, tcr);//设置渲染器


        JTableHeader jTableHeader = table1.getTableHeader();// 获取表头
        table1.setRowHeight(20); //设置行高

        table1.setModel(new DefaultTableModel(
                str_s,
                new String[]{
                        "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u8bed\u6587", "\u6570\u5b66", "\u82f1\u8bed", "\u603b\u5206"
                }
        ));
    }

    private void button1ActionPerformed(ActionEvent e) {
        String number = textField1.getText();
        Revise_things revise_things =new Revise_things();
        ArrayList<String[]> strings=revise_things.search(number);
        String[][] str_s = strings.toArray(new String[0][0]);
        set_table(str_s);

        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {

        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
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
                new String[] {
                    "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u8bed\u6587", "\u6570\u5b66", "\u82f1\u8bed", "\u603b\u5206"
                }
            ));
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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.setContentAreaFilled(false);
        button2.setContentAreaFilled(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
