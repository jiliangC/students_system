/*
 * Created by JFormDesigner on Wed Jul 07 20:07:42 AWST 2021
 */

package view;
import main_information.Str_information;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 * @author cjl
 */
public class Main<str> extends JFrame {



    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        Str_information strInformation = new Str_information();
        String[][] str_s=strInformation.get_str();

        setVisible(true);
        initComponents(str_s);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void menu1Item1ActionPerformed(ActionEvent e) {
        new Addstuden();
        // TODO add your code here
    }

    private void initComponents(String[][] str_s) {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu1Item1 = new JMenuItem();
        menu1Item2 = new JMenuItem();
        menu1Item3 = new JMenuItem();
        menu1Item4 = new JMenuItem();
        menu2 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menu3 = new JMenu();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setForeground(SystemColor.menu);
        setFont(new Font(Font.DIALOG, Font.PLAIN, 13));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {
            menuBar1.setBorderPainted(false);
            menuBar1.setPreferredSize(new Dimension(183, 30));

            //======== menu1 ========
            {
                menu1.setText("\u57fa\u672c\u64cd\u4f5c");
                menu1.setPreferredSize(null);
                menu1.setRolloverIcon(null);
                menu1.setPressedIcon(null);
                menu1.setIcon(null);
                menu1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- menu1Item1 ----
                menu1Item1.setText("\u6dfb\u52a0");
                menu1Item1.setIcon(new ImageIcon(getClass().getResource("/icon/plus.png")));
                menu1Item1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu1Item1.addActionListener(e -> menu1Item1ActionPerformed(e));
                menu1.add(menu1Item1);

                //---- menu1Item2 ----
                menu1Item2.setText("\u5220\u9664");
                menu1Item2.setIcon(new ImageIcon(getClass().getResource("/icon/reduce.png")));
                menu1Item2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu1.add(menu1Item2);

                //---- menu1Item3 ----
                menu1Item3.setText("\u67e5\u627e");
                menu1Item3.setIcon(new ImageIcon(getClass().getResource("/icon/search.png")));
                menu1Item3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu1.add(menu1Item3);

                //---- menu1Item4 ----
                menu1Item4.setText("\u4fee\u6539");
                menu1Item4.setIcon(new ImageIcon(getClass().getResource("/icon/change.png")));
                menu1Item4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu1.add(menu1Item4);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u5bfc\u5165\u5bfc\u51fa");
                menu2.setMinimumSize(null);
                menu2.setIcon(null);
                menu2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- menuItem2 ----
                menuItem2.setText("\u5bfc\u5165\u5b66\u751f\u4fe1\u606f");
                menuItem2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu2.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u5bfc\u51fa\u5b66\u751f\u6210\u7ee9");
                menuItem3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu2.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("\u5bfc\u51fa\u5b66\u751f\u4fe1\u606f");
                menuItem4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu2.add(menuItem4);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u5e2e\u52a9\u5173\u4e8e");
                menu3.setPreferredSize(null);
                menu3.setIcon(null);
                menu3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- menuItem5 ----
                menuItem5.setText("\u5e2e\u52a9");
                menuItem5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu3.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("\u5173\u4e8e");
                menuItem6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu3.add(menuItem6);
            }
            menuBar1.add(menu3);
        }
        setJMenuBar(menuBar1);

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".
            equals(e.getPropertyName()))throw new RuntimeException();}});
            panel1.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setBorder(new EmptyBorder(5, 0, 0, 0));

                //---- table1 ----

                table1.setBorder(new EmptyBorder(5, 0, 0, 0));
                table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table1.setPreferredSize(null);
                table1.updateUI();
                table1.setModel(new DefaultTableModel(
                    str_s,
                    new String[] {
                        "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u8bed\u6587", "\u6570\u5b66", "\u82f1\u8bed", "\u603b\u5206"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        setSize(710, 440);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menu1Item1;
    private JMenuItem menu1Item2;
    private JMenuItem menu1Item3;
    private JMenuItem menu1Item4;
    private JMenu menu2;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenu menu3;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
