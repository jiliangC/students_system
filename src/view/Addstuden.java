package view;

import main_information.AddStudents;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;


public class Addstuden extends JFrame {
    public static void main(String[] args) {
        new Addstuden();
    }

    public Addstuden() { setTitle("增加学生信息");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }

    //登录按钮事件
    private void button1ActionPerformed(ActionEvent e) {
        int judge =0;
        String name = Name.getText();
        String number = Number.getText();
        String sex = (Man.isSelected()) ? "男" : "女";
        String chinese = Chinese.getText();
        String math = Maths.getText();
        String english = English.getText();
        AddStudents addStudents = new AddStudents(number,name,sex,chinese,math,english);
        if (addStudents.j()==1){ //输入的格式正确
            dispose();
        }

    }
    //单选框 点击事件
    private void manActionPerformed(ActionEvent e) {
        if (Man.isSelected()) {
            Woman.setSelected(false);
        }
    }
    private void WomanActionPerformed(ActionEvent e) {
        if (Woman.isSelected()) {
            Man.setSelected(false);
        }
    }

    //UI设计
    private void initComponents() {
        JPanel panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        Number = new JTextField();
        label2 = new JLabel();
        Name = new JTextField();
        label4 = new JLabel();
        Chinese = new JTextField();
        label5 = new JLabel();
        Maths = new JTextField();
        label6 = new JLabel();
        English = new JTextField();
        Add1 = new JButton();
        Man = new JRadioButton();
        Woman = new JRadioButton();

        Number.setOpaque(false);
        Name.setOpaque(false);
        Chinese.setOpaque(false);
        Maths.setOpaque(false);
        English.setOpaque(false);
        Add1.setContentAreaFilled(false);



        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        //======== panel1 ========
        {

            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- label1 ----
                label1.setText("学号");
                panel2.add(label1);
                label1.setBounds(70, 35, label1.getPreferredSize().width, 25);
                panel2.add(Number);
                Number.setBounds(110, 35, 150, 25);

                //---- label2 ----
                label2.setText("姓名");
                panel2.add(label2);
                label2.setBounds(70, 80, label2.getPreferredSize().width, 25);
                panel2.add(Name);
                Name.setBounds(110, 80, 150, 25);

                //---- label4 ----
                label4.setText("语文");
                panel2.add(label4);
                label4.setBounds(70, 170, label4.getPreferredSize().width, 25);
                panel2.add(Chinese);
                Chinese.setBounds(110, 170, 150, 25);

                //---- label5 ----
                label5.setText("数学");
                panel2.add(label5);
                label5.setBounds(70, 215, label5.getPreferredSize().width, 25);
                panel2.add(Maths);
                Maths.setBounds(110, 215, 150, 25);

                //---- label6 ----
                label6.setText("英语");
                panel2.add(label6);
                label6.setBounds(70, 260, label6.getPreferredSize().width, 25);
                panel2.add(English);
                English.setBounds(110, 260, 150, 25);

                //---- Add1 ----
                Add1.setText("添加");
                Add1.addActionListener(this::button1ActionPerformed);
                panel2.add(Add1);
                Add1.setBounds(70, 320, 190, 25);

                //---- Man ----
                Man.setText("男");
                Man.setSelected(true);
                Man.addActionListener(this::manActionPerformed);
                panel2.add(Man);
                Man.setBounds(110, 125, Man.getPreferredSize().width, 25);

                //---- Woman ----
                Woman.setText("女");
                Woman.addActionListener(this::WomanActionPerformed);
                panel2.add(Woman);
                Woman.setBounds(210, 125, Woman.getPreferredSize().width, 25);
            }
            panel1.add(panel2, BorderLayout.CENTER);
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 330, 410);

        contentPane.setPreferredSize(new Dimension(330, 410));
        pack();
        setLocationRelativeTo(getOwner());
    }

    private JPanel panel2;
    private JLabel label1;
    private JTextField Number;
    private JLabel label2;
    private JTextField Name;
    private JLabel label4;
    private JTextField Chinese;
    private JLabel label5;
    private JTextField Maths;
    private JLabel label6;
    private JTextField English;
    private JButton Add1;
    private JRadioButton Man;
    private JRadioButton Woman;
}
