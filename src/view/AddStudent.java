package view;

import main_information.AddStudents;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;


public class AddStudent extends JFrame {
    JTable table;  //Main的table
    private JTextField Number;
    private JTextField Name;
    private JTextField Chinese;
    private JTextField Maths;
    private JTextField English;
    private JRadioButton Man;
    private JRadioButton Woman;

    public static void main(String[] args) {
        new AddStudent(null);
    }

    public AddStudent(JTable table1) {
        this.table = table1;
        setTitle("增加学生信息");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }

    //添加按钮事件
    private void add(ActionEvent e) {
        String name = Name.getText();
        String number = Number.getText();
        String sex = (Man.isSelected()) ? "男" : "女";
        String chinese = Chinese.getText();
        String math = Maths.getText();
        String english = English.getText();
        AddStudents addStudents = new AddStudents(number, name, sex, chinese, math, english, table);
        if (addStudents.j() == 1) { //输入的格式正确
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
        JPanel panel2 = new JPanel();
        JLabel num_label = new JLabel();
        Number = new JTextField();
        JLabel name_label = new JLabel();
        Name = new JTextField();
        JLabel ch_label = new JLabel();
        Chinese = new JTextField();
        JLabel ma_label = new JLabel();
        Maths = new JTextField();
        JLabel en_label = new JLabel();
        English = new JTextField();
        JButton add_button = new JButton();
        Man = new JRadioButton();
        Woman = new JRadioButton();

        Number.setOpaque(false);
        Name.setOpaque(false);
        Chinese.setOpaque(false);
        Maths.setOpaque(false);
        English.setOpaque(false);
        add_button.setContentAreaFilled(false);


        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        //======== panel1 ========
        {

            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- num_label ----
                num_label.setText("学号");
                panel2.add(num_label);
                num_label.setBounds(70, 35, num_label.getPreferredSize().width, 25);
                panel2.add(Number);
                Number.setBounds(110, 35, 150, 25);

                //---- name_label ----
                name_label.setText("姓名");
                panel2.add(name_label);
                name_label.setBounds(70, 80, name_label.getPreferredSize().width, 25);
                panel2.add(Name);
                Name.setBounds(110, 80, 150, 25);

                //---- ch_label ----
                ch_label.setText("语文");
                panel2.add(ch_label);
                ch_label.setBounds(70, 170, ch_label.getPreferredSize().width, 25);
                panel2.add(Chinese);
                Chinese.setBounds(110, 170, 150, 25);

                //---- ma_label ----
                ma_label.setText("数学");
                panel2.add(ma_label);
                ma_label.setBounds(70, 215, ma_label.getPreferredSize().width, 25);
                panel2.add(Maths);
                Maths.setBounds(110, 215, 150, 25);

                //---- en_label ----
                en_label.setText("英语");
                panel2.add(en_label);
                en_label.setBounds(70, 260, en_label.getPreferredSize().width, 25);
                panel2.add(English);
                English.setBounds(110, 260, 150, 25);

                //---- add_button ----
                add_button.setText("添加");
                add_button.addActionListener(this::add);
                panel2.add(add_button);
                add_button.setBounds(70, 320, 190, 25);

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


}
