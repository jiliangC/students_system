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
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label2 ----
        label2.setText("\u6bcf\u8fdb\u884c\u4e00\u6b21\u6570\u636e\u64cd\u4f5c\u9700\u8981\u5237\u65b0");
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("sansserif", Font.BOLD, 14));
        contentPane.add(label2);
        label2.setBounds(30, 15, 330, 25);

        //---- label3 ----
        label3.setText("\u5b66\u53f7\u4e3a\u5341\u4f4d\u6570\uff0c\u5404\u79d1\u6210\u7ee9\u6ee1\u5206100");
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("sansserif", Font.BOLD, 14));
        contentPane.add(label3);
        label3.setBounds(30, 40, 330, 25);

        //---- label4 ----
        label4.setText("\u70b9\u51fb\u4fee\u6539\u529f\u80fd\u540e\u518d\u70b9\u51fb\u8868\u683c\u7684\u6570\u636e\u5c31\u53ef\u4ee5\u4fee\u6539");
        label4.setFont(new Font("sansserif", Font.BOLD, 14));
        contentPane.add(label4);
        label4.setBounds(30, 65, 330, 25);

        //---- label5 ----
        label5.setText("\u4ee5\u4e0a\u662f\u4fdd\u59c6\u7ea7\u6559\u7a0b");
        label5.setFont(new Font("sansserif", Font.BOLD, 14));
        contentPane.add(label5);
        label5.setBounds(30, 90, 330, 25);

        contentPane.setPreferredSize(new Dimension(400, 130));
        pack();
        setLocationRelativeTo(getOwner());

    }


    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
}
