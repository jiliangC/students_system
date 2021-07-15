package view;

import main_information.Search_go;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Search extends JFrame {
    public static void main(String[] args) {
        new Search();
    }
    public Search() {
        setTitle("学生信息查询");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }


    private void button1ActionPerformed(ActionEvent e) {
        String number = textField1.getText();
        String name= textField2.getText();
        Search_go search_go = new Search_go(table1);

        String[][] str_s=search_go.get_result(number,name);
        search_go.set_Table(str_s);
        // TODO add your code here
    }

    private void initComponents() {

        textField1 = new JTextField();
        label1 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
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
        label2.setText("\u59d3\u540d");
        label2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        contentPane.add(label2);
        label2.setBounds(230, 20, 35, 25);

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
            table1.setSurrendersFocusOnKeystroke(true);
            table1.setCellSelectionEnabled(true);
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(30, 65, 560, 225);

        //---- button1 ----
        button1.setText("\u641c\u7d22");
        button1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 12));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(530, 20, 60, 25);

        contentPane.setPreferredSize(new Dimension(620, 315));
        pack();
        setLocationRelativeTo(getOwner());
        button1.setContentAreaFilled(false);
    }

    private JTextField textField1;
    private JLabel label1;
    private JTextField textField2;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
}
