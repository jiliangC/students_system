package view;

import java.awt.*;
import java.util.Objects;
import javax.swing.*;

public class About extends JFrame {
    public static void main(String[] args) {
        new About();
    }
    public About() {
        setTitle("关于");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/about2.png"))));
        contentPane.add(label1);
        label1.setBounds(120, 45, 100, 100);

        //---- label2 ----
        label2.setText("扫码有惊喜");
        label2.setFont(new Font("宋体", Font.BOLD, 14));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label2);
        label2.setBounds(120, 165, 100, 25);

        contentPane.setPreferredSize(new Dimension(340, 235));
        pack();
        setLocationRelativeTo(getOwner());
    }

}
