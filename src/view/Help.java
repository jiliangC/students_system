package view;

import java.awt.*;
import java.util.Objects;
import javax.swing.*;

public class Help extends JFrame {
    public static void main(String[] args) {
        new Help();
    }
    public Help() {
        setTitle("帮助");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label2 ----
        label2.setText("学号长度为10，成绩满分为100分");
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("宋体", Font.BOLD, 14));
        contentPane.add(label2);
        label2.setBounds(30, 15, 430, 25);

        //---- label3 ----
        label3.setText("搜索功能可以搜索名字或学号");
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("宋体", Font.BOLD, 14));
        contentPane.add(label3);
        label3.setBounds(30, 40, 430, 25);

        //---- label4 ----
        label4.setText("修改功能在搜索出来后修改表格的数据即可修改学生信息");
        label4.setFont(new Font("宋体", Font.BOLD, 14));
        contentPane.add(label4);
        label4.setBounds(30, 65, 430, 25);

        //---- label5 ----
        label5.setText("刷新按钮是原来技术不够加上去刷新表格的，现在没必要了，懒得删了");
        label5.setFont(new Font("宋体", Font.BOLD, 14));
        contentPane.add(label5);
        label5.setBounds(30, 90, 500, 25);

        //---- label6 ----
        label6.setText("更多BUG，自行发现");
        label6.setFont(new Font("宋体", Font.BOLD, 14));
        contentPane.add(label6);
        label6.setBounds(30, 115, 500, 25);

        contentPane.setPreferredSize(new Dimension(530, 155));
        pack();
        setLocationRelativeTo(getOwner());
    }

}
