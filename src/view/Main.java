package view;
import main_information.File_information;
import main_information.Set_Table;
import main_information.String_Function;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author cjl
 */
public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setTitle("学生管理系统");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }

    private void menu1Item1ActionPerformed(ActionEvent e) { //增加
        new Addstuden(table1);
        // TODO add your code here
    }

    private void button1ActionPerformed(ActionEvent e) { //刷新按钮
        String_Function string_function = new String_Function();
        String[][] str_s=string_function.get_s();
        new Set_Table(table1,str_s,0);

        // TODO add your code here
    }


    private void menu1Item2ActionPerformed(ActionEvent e) { //删除
        new DeleteStudents(table1);
        // TODO add your code here
    }

    private void menu1Item3ActionPerformed(ActionEvent e) {
        new Search();
        // TODO add your code here
    }

    private void menu1Item4ActionPerformed(ActionEvent e) {
        new Revise(table1);
        // TODO add your code here
    }
    
    File_information file_information = new File_information();//导入学生信息 bug太多暂时不写
    private void menuItem2ActionPerformed(ActionEvent e) {
        //file_information.showFileOpenDialog();
        // TODO add your code here
    }

    private void menuItem3ActionPerformed(ActionEvent e) { //导出学生信息
        file_information.showFileSaveDialog();
        // TODO add your code here
    }

    private void menuItem5ActionPerformed(ActionEvent e) {
        new Help();
        // TODO add your code here
    }

    private void menuItem6ActionPerformed(ActionEvent e) {
        new About();
        // TODO add your code here
    }

    public void initComponents() {
        String_Function string_function = new String_Function();
        String[][] str_s = string_function.get_s();

        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu1Item1 = new JMenuItem();
        menu1Item2 = new JMenuItem();
        menu1Item3 = new JMenuItem();
        menu1Item4 = new JMenuItem();
        menu2 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menu3 = new JMenu();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        panel2 = new JPanel();
        button1 = new JButton();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setForeground(SystemColor.menu);
        setFont(new Font(Font.DIALOG, Font.PLAIN, 13));
        setIconImage(new ImageIcon(getClass().getResource("/icon/students.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {
            menuBar1.setPreferredSize(new Dimension(183, 30));
            menuBar1.setBorderPainted(false);

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
                menu1Item2.addActionListener(e -> menu1Item2ActionPerformed(e));
                menu1.add(menu1Item2);

                //---- menu1Item3 ----
                menu1Item3.setText("\u67e5\u627e");
                menu1Item3.setIcon(new ImageIcon(getClass().getResource("/icon/search.png")));
                menu1Item3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu1Item3.addActionListener(e -> menu1Item3ActionPerformed(e));
                menu1.add(menu1Item3);

                //---- menu1Item4 ----
                menu1Item4.setText("\u4fee\u6539");
                menu1Item4.setIcon(new ImageIcon(getClass().getResource("/icon/change.png")));
                menu1Item4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menu1Item4.addActionListener(e -> menu1Item4ActionPerformed(e));
                menu1.add(menu1Item4);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u5bfc\u51fa\u4fe1\u606f");
                menu2.setMinimumSize(null);
                menu2.setIcon(null);
                menu2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- menuItem2 ----
                menuItem2.setText("\u5bfc\u5165\u5b66\u751f\u4fe1\u606f");
                menuItem2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menuItem2.setIcon(new ImageIcon(getClass().getResource("/icon/import.png")));
                menuItem2.setVisible(false);
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu2.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u5bfc\u51fa\u5b66\u751f\u4fe1\u606f");
                menuItem3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menuItem3.setIcon(new ImageIcon(getClass().getResource("/icon/export.png")));
                menuItem3.addActionListener(e -> menuItem3ActionPerformed(e));
                menu2.add(menuItem3);
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
                menuItem5.setIcon(new ImageIcon(getClass().getResource("/icon/help.png")));
                menuItem5.addActionListener(e -> menuItem5ActionPerformed(e));
                menu3.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("\u5173\u4e8e");
                menuItem6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menuItem6.setIcon(new ImageIcon(getClass().getResource("/icon/about.png")));
                menuItem6.addActionListener(e -> menuItem6ActionPerformed(e));
                menu3.add(menuItem6);
            }
            menuBar1.add(menu3);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setBorder(new EmptyBorder(2, 0, 0, 5));
                panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

                //---- button1 ----
                button1.setText("\u5237\u65b0");
                button1.setOpaque(true);
                button1.setFont(new Font("sansserif", Font.BOLD, 10));
                button1.setIcon(null);
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel2.add(button1);
            }
            menuBar1.add(panel2);
        }
        setJMenuBar(menuBar1);

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setBorder(new EmptyBorder(5, 0, 0, 0));

                //---- table1 ----
                table1.setBorder(new EmptyBorder(5, 10, 10, 10));
                table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table1.setPreferredSize(null);
                new Set_Table(table1,str_s,0);
                table1.setSurrendersFocusOnKeystroke(true);
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        setSize(710, 440);
        setLocationRelativeTo(null);

        button1.setContentAreaFilled(false);
    }

    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menu1Item1;
    private JMenuItem menu1Item2;
    private JMenuItem menu1Item3;
    private JMenuItem menu1Item4;
    private JMenu menu2;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenu menu3;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JPanel panel2;
    private JButton button1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
}
