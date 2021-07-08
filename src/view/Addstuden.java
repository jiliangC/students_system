/*
 * Created by JFormDesigner on Wed Jul 07 19:03:22 AWST 2021
 */

package view;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;
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

    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private void button1ActionPerformed(ActionEvent e) {
        String name = Name.getText();
        String number = Number.getText();
        String sex = (Man.isSelected())?"男":"女";
        String chinese = Chinese.getText();
        String math = Maths.getText();
        String english = English.getText();
        if (name.equals("")||chinese.equals("")||math.equals("")||english.equals("")){
            JOptionPane.showMessageDialog(null,"不能留空");
        }
        else if (!isNumeric(number)||number.length()!=10){
            JOptionPane.showMessageDialog(null,"学号格式不正确");
        }
        else if (!isNumeric(chinese)||chinese.length()>=4){
            JOptionPane.showMessageDialog(null,"语文成绩格式不正确");
        }
        else if (!isNumeric(math)||math.length()>=4){
            JOptionPane.showMessageDialog(null,"数学成绩格式不正确");
        }
        else if (!isNumeric(english)||english.length()>=4){
            JOptionPane.showMessageDialog(null,"英语成绩格式不正确");
        }
        else{
            String info = "已添加\n"+"姓名 "+name+"\n"+"学号 "+number+"\n"+"性别 "+sex+"\n"+"语文 "+chinese+"  "+"数学 "+math+"  "+"英语 "+english;
            JOptionPane.showMessageDialog(null,info);
            // TODO add your code 添加的事件
        }

    }

    private void manActionPerformed(ActionEvent e) {
        if(Man.isSelected()){
            Woman.setSelected(false);
        }
    }


    private void WomanActionPerformed(ActionEvent e) {
        if(Woman.isSelected()){
            Man.setSelected(false);
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
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

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new BorderLayout());

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- label1 ----
                label1.setText("\u5b66\u53f7");
                panel2.add(label1);
                label1.setBounds(70, 35, label1.getPreferredSize().width, 25);
                panel2.add(Number);
                Number.setBounds(110, 35, 150, 25);

                //---- label2 ----
                label2.setText("\u59d3\u540d");
                panel2.add(label2);
                label2.setBounds(70, 80, label2.getPreferredSize().width, 25);
                panel2.add(Name);
                Name.setBounds(110, 80, 150, 25);

                //---- label4 ----
                label4.setText("\u8bed\u6587");
                panel2.add(label4);
                label4.setBounds(70, 170, label4.getPreferredSize().width, 25);
                panel2.add(Chinese);
                Chinese.setBounds(110, 170, 150, 25);

                //---- label5 ----
                label5.setText("\u6570\u5b66");
                panel2.add(label5);
                label5.setBounds(70, 215, label5.getPreferredSize().width, 25);
                panel2.add(Maths);
                Maths.setBounds(110, 215, 150, 25);

                //---- label6 ----
                label6.setText("\u82f1\u8bed");
                panel2.add(label6);
                label6.setBounds(70, 260, label6.getPreferredSize().width, 25);
                panel2.add(English);
                English.setBounds(110, 260, 150, 25);

                //---- Add1 ----
                Add1.setText("\u6dfb\u52a0");
                Add1.addActionListener(e -> button1ActionPerformed(e));
                panel2.add(Add1);
                Add1.setBounds(70, 320, 190, 25);

                //---- Man ----
                Man.setText("\u7537");
                Man.setSelected(true);
                Man.addActionListener(e -> manActionPerformed(e));
                panel2.add(Man);
                Man.setBounds(110, 125, Man.getPreferredSize().width, 25);

                //---- Woman ----
                Woman.setText("\u5973");
                Woman.addActionListener(e -> {
			WomanActionPerformed(e);
		});
                panel2.add(Woman);
                Woman.setBounds(210, 125, Woman.getPreferredSize().width, 25);

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
