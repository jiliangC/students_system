/*
 * Created by JFormDesigner on Tue Jul 13 17:58:06 AWST 2021
 */

package view;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
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
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/icon/students.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/icon/about2.png")));
        contentPane.add(label1);
        label1.setBounds(120, 45, 100, 100);

        //---- label2 ----
        label2.setText("\u626b\u7801\u6709\u60ca\u559c");
        label2.setFont(new Font("sansserif", Font.BOLD, 14));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label2);
        label2.setBounds(120, 165, 100, 25);

        contentPane.setPreferredSize(new Dimension(340, 235));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
