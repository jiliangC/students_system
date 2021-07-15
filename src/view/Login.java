
package view;

import main_information.File_information;
import main_information.Login_go;

import java.awt.*;
import java.io.File;
import java.util.Objects;
import javax.swing.*;


public class Login extends JFrame {

    public static void main(String[] args) {
        new Login();
    }

    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
        setResizable(false);
        setTitle("登录");
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }

    private void button1ActionPerformed() {
        File_information file_information = new File_information();
        file_information.create_file(new File("src/students_info"));
        String username = Username.getText();
        String password = String.valueOf(Password.getPassword());
        Login_go login_go=new Login_go(username,password);
        int judge = login_go.go();
        if (judge==2){
            Username.setText("");
            Password.setText("");
        } else if (judge==0){
            dispose();
        }
        // 登录事件
    }

    private void initComponents() {
        panel1 = new JPanel();
        Username = new JTextField();
        JButton logo = new JButton();
        label1 = new JLabel();
        Password = new JPasswordField();
        panel2 = new JPanel();
        label2 = new JLabel();
        //编辑框透明
        Username.setOpaque(false);
        Password.setOpaque(false);
        logo.setOpaque(false);
        logo.setContentAreaFilled(false); //背景透明

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(100, 100));

        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
                    .swing.border.EmptyBorder(0, 0, 0, 0), "Designed by cjl", javax.swing
                    .border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.
                    Font("楷体", java.awt.Font.BOLD, 12), Color.GRAY
            ), panel1.getBorder()));

            panel1.setLayout(null);
            panel1.add(Username);
            Username.setBounds(150, 75, 210, 25);


            //---- logo ----
            logo.setText("登录");
            logo.setBorderPainted(true);//显示边框
            logo.addActionListener(e -> button1ActionPerformed());
            panel1.add(logo);
            logo.setBounds(150, 145, 210, 25);

            //---- label1 ----
            Image img = new ImageIcon("src/icon/login.png").getImage();
            label1.setIcon(new ImageIcon(img));
            panel1.add(label1);
            label1.setBounds(35, 75, 95, 95);
            panel1.add(Password);
            Password.setBounds(150, 110, 210, 25);

            //======== panel2 ========
            {

                panel2.setLayout(new FlowLayout());

                //---- top ----
                label2.setText("欢迎使用学生管理系统");
                panel2.add(label2);
            }
            panel1.add(panel2);
            panel2.setBounds(0, 20, 400, panel2.getPreferredSize().height);

            {
                Dimension preferredSize = new Dimension();
                for (int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        setSize(400, 280);
        setLocationRelativeTo(getOwner());
    }

    private JPanel panel1;
    private JTextField Username;
    private JLabel label1;
    private JPasswordField Password;
    private JPanel panel2;
    private JLabel label2;

}
