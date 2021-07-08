/*
 * Created by JFormDesigner on Wed Jul 07 20:07:42 AWST 2021
 */

package view;
import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        String[] subject = {"学号","姓名","性别","语文","数学","英语"};
        String[][] information={
                {"2007310421","小华","男","87","67","96"},
                {"2007310421","小华","男","87","67","96"}};

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

                //---- menu1Item1 ----
                menu1Item1.setText("\u6dfb\u52a0");
                menu1Item1.setIcon(new ImageIcon(getClass().getResource("/icon/plus.png")));
                menu1.add(menu1Item1);

                //---- menu1Item2 ----
                menu1Item2.setText("\u5220\u9664");
                menu1Item2.setIcon(new ImageIcon(getClass().getResource("/icon/reduce.png")));
                menu1.add(menu1Item2);

                //---- menu1Item3 ----
                menu1Item3.setText("\u67e5\u627e");
                menu1Item3.setIcon(new ImageIcon(getClass().getResource("/icon/search.png")));
                menu1.add(menu1Item3);

                //---- menu1Item4 ----
                menu1Item4.setText("\u4fee\u6539");
                menu1Item4.setIcon(new ImageIcon(getClass().getResource("/icon/change.png")));
                menu1.add(menu1Item4);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u5bfc\u5165\u5bfc\u51fa");
                menu2.setMinimumSize(null);
                menu2.setIcon(null);

                //---- menuItem2 ----
                menuItem2.setText("\u5bfc\u5165\u5b66\u751f\u4fe1\u606f");
                menu2.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u5bfc\u51fa\u5b66\u751f\u6210\u7ee9");
                menu2.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("\u5bfc\u51fa\u5b66\u751f\u4fe1\u606f");
                menu2.add(menuItem4);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u5e2e\u52a9\u5173\u4e8e");
                menu3.setPreferredSize(null);
                menu3.setIcon(null);

                //---- menuItem5 ----
                menuItem5.setText("\u5e2e\u52a9");
                menu3.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("\u5173\u4e8e");
                menu3.add(menuItem6);
            }
            menuBar1.add(menu3);
        }
        setJMenuBar(menuBar1);

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
            ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            panel1.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setBorder(null);
                table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table1.setPreferredSize(null);
                table1.setFont(new Font(Font.DIALOG, Font.PLAIN, 13));
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
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
