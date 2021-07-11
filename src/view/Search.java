/*
 * Created by JFormDesigner on Sun Jul 11 17:00:29 AWST 2021
 */

package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author unknown
 */
public class Search extends JFrame {
    public static void main(String[] args) {
        new Search();
    }
    public Search() {
        setTitle("学生信息查询");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textField1 = new JTextField();
        label1 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- textField1 ----
        textField1.setOpaque(false);
        contentPane.add(textField1);
        textField1.setBounds(65, 20, 120, 25);

        //---- label1 ----
        label1.setText("\u5b66\u53f7");
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        contentPane.add(label1);
        label1.setBounds(30, 20, 35, 25);

        //---- textField2 ----
        textField2.setOpaque(false);
        contentPane.add(textField2);
        textField2.setBounds(265, 20, 120, 25);

        //---- label2 ----
        label2.setText("\u603b\u5206");
        label2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        contentPane.add(label2);
        label2.setBounds(230, 20, 35, 25);

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null},
                    {null, null, null, null},
                },
                new String[] {
                    "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u603b\u5206"
                }
            ));
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(30, 65, 615, 270);

        //---- label3 ----
        label3.setText("\u6027\u522b");
        label3.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        contentPane.add(label3);
        label3.setBounds(430, 20, 35, 25);

        //---- comboBox1 ----
        comboBox1.setOpaque(false);
        comboBox1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "\u7537",
            "\u5973"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(465, 20, 80, 25);

        //---- button1 ----
        button1.setText("\u641c\u7d22");
        button1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        contentPane.add(button1);
        button1.setBounds(585, 20, button1.getPreferredSize().width, 25);

        contentPane.setPreferredSize(new Dimension(675, 390));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.setContentAreaFilled(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField textField1;
    private JLabel label1;
    private JTextField textField2;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
