
package view;

import java.awt.*;
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
    }

    private void button1ActionPerformed() {
        String username=Username.getText();
        String password= String.valueOf(Password.getPassword());
        if (username.equals("1")&&password.equals("1")){
            System.out.println("登录成功");
            setVisible(false);
            new Main();
            //下一个窗口
        }
        else if (username.trim().length() == 0 || password.trim().length() == 0){
            JOptionPane.showMessageDialog(null, "用户名或密码不能为空");
        }
        else {
            JOptionPane.showMessageDialog(null, "用户名或密码不正确");
            Username.setText("");
            Password.setText("");
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

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(100, 100));

        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
                    .swing.border.EmptyBorder(0,0,0,0), "Designed by cjl",javax.swing
                    .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM, new java.awt.
                    Font("Dia\u006cog", java.awt.Font.BOLD, 12), Color.GRAY
            ),panel1. getBorder()));

            panel1.setLayout(null);
            panel1.add(Username);
            Username.setBounds(150, 75, 210, 25);

            //---- logo ----
            logo.setText("\u767b\u5f55");
            logo.addActionListener(e -> button1ActionPerformed());
            panel1.add(logo);
            logo.setBounds(150, 145, 210, 25);

            //---- label1 ----
            label1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/people.png"))));
            label1.setBackground(new Color(51, 255, 0, 255));
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
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
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
