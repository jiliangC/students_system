/*
 * Created by JFormDesigner on Wed Jul 07 19:03:22 AWST 2021
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author unknown
 */
public class Addstuden extends JFrame {
    private Font font;
    public static void main(String[] args) {
        new Addstuden();

    }
    public Addstuden() {
        font = new Font("楷体", Font.BOLD, 12);
        setTitle("增加学生");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here 添加的事件
    }

    private void manActionPerformed(ActionEvent e) {
        if(man.isSelected()){
            woman.setSelected(false);
        }
        // TODO add your code here
    }


    private void womanActionPerformed(ActionEvent e) {
            if(woman.isSelected()){
                man.setSelected(false);
            }
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        number = new JTextField();
        label2 = new JLabel();
        name = new JTextField();
        label4 = new JLabel();
        chinese = new JTextField();
        label5 = new JLabel();
        math = new JTextField();
        label6 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        man = new JRadioButton();
        woman = new JRadioButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.
            border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER
            ,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font
            .BOLD,12),java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r"
            .equals(e.getPropertyName()))throw new RuntimeException();}});
            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- label1 ----
                label1.setText("\u5b66\u53f7");
                panel2.add(label1);
                label1.setBounds(70, 35, label1.getPreferredSize().width, 25);
                panel2.add(number);
                number.setBounds(110, 35, 150, 25);

                //---- label2 ----
                label2.setText("\u59d3\u540d");
                panel2.add(label2);
                label2.setBounds(70, 80, label2.getPreferredSize().width, 25);
                panel2.add(name);
                name.setBounds(110, 80, 150, 25);

                //---- label4 ----
                label4.setText("\u8bed\u6587");
                panel2.add(label4);
                label4.setBounds(70, 170, label4.getPreferredSize().width, 25);
                panel2.add(chinese);
                chinese.setBounds(110, 170, 150, 25);

                //---- label5 ----
                label5.setText("\u6570\u5b66");
                panel2.add(label5);
                label5.setBounds(70, 215, label5.getPreferredSize().width, 25);
                panel2.add(math);
                math.setBounds(110, 215, 150, 25);

                //---- label6 ----
                label6.setText("\u82f1\u8bed");
                panel2.add(label6);
                label6.setBounds(70, 260, label6.getPreferredSize().width, 25);
                panel2.add(textField3);
                textField3.setBounds(110, 260, 150, 25);

                //---- button1 ----
                button1.setText("\u6dfb\u52a0");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel2.add(button1);
                button1.setBounds(70, 320, 190, 25);

                //---- man ----
                man.setText("\u7537");
                man.addActionListener(e -> manActionPerformed(e));
                panel2.add(man);
                man.setBounds(110, 125, man.getPreferredSize().width, 25);

                //---- woman ----
                woman.setText("\u5973");
                woman.addActionListener(e -> womanActionPerformed(e));
                panel2.add(woman);
                woman.setBounds(210, 125, woman.getPreferredSize().width, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2, BorderLayout.CENTER);
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 330, 393);

        contentPane.setPreferredSize(new Dimension(330, 410));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JTextField number;
    private JLabel label2;
    private JTextField name;
    private JLabel label4;
    private JTextField chinese;
    private JLabel label5;
    private JTextField math;
    private JLabel label6;
    private JTextField textField3;
    private JButton button1;
    private JRadioButton man;
    private JRadioButton woman;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
