package view;

import main_information.File_information;
import main_information.Set_Table;
import main_information.String_Function;

import java.awt.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.border.*;

public class Main extends JFrame {
    private JTable table;

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

    private void add_students() { //增加
        new AddStudent(table);
        // TODO add your code here
    }

    private void refresh() { //刷新
        String_Function string_function = new String_Function();
        String[][] str_s = string_function.get_s();
        new Set_Table(table, str_s, 0);
        // TODO add your code here
    }

    private void delete_students() { //删除
        new DeleteStudents(table);
        // TODO add your code here
    }

    private void search_students() { //搜索
        new Search();
        // TODO add your code here
    }

    private void revise_students() { //修改
        new Revise(table);
        // TODO add your code here
    }

    File_information file_information = new File_information();//导入学生信息

    private void import_students() {
        //file_information.showFileOpenDialog();
        // TODO add your code here
    }

    private void export_students() { //导出学生信息
        file_information.showFileSaveDialog();
        // TODO add your code here
    }

    private void helps() { //帮助
        new Help();
        // TODO add your code here
    }

    private void about() { //关于
        new About();
        // TODO add your code here
    }

    public void initComponents() {
        String_Function string_function = new String_Function();
        String[][] str_s = string_function.get_s();

        JMenuBar menuBar1 = new JMenuBar();
        JMenu operation = new JMenu();
        JMenuItem operation_add = new JMenuItem();
        JMenuItem operation_delete = new JMenuItem();
        JMenuItem operation_search = new JMenuItem();
        JMenuItem operation_revise = new JMenuItem();
        JMenu export = new JMenu();
        JMenuItem menuItem2 = new JMenuItem();
        JMenuItem export_info = new JMenuItem();
        JMenu help_about = new JMenu();
        JMenuItem help_use = new JMenuItem();
        JMenuItem about_use = new JMenuItem();
        JPanel panel2 = new JPanel();
        JButton refresh_button = new JButton();
        JPanel panel1 = new JPanel();
        JScrollPane scrollPane1 = new JScrollPane();
        table = new JTable();

        //======== this ========
        setForeground(SystemColor.menu);
        setFont(new Font(Font.DIALOG, Font.PLAIN, 13));
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {
            menuBar1.setPreferredSize(new Dimension(183, 30));
            menuBar1.setBorderPainted(false);

            //======== operation ========
            {
                operation.setText("基本操作");
                operation.setPreferredSize(null);
                operation.setRolloverIcon(null);
                operation.setPressedIcon(null);
                operation.setIcon(null);
                operation.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- operation_add ----
                operation_add.setText("添加");
                operation_add.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/plus.png"))));
                operation_add.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                operation_add.addActionListener(e -> add_students());
                operation.add(operation_add);

                //---- operation_delete ----
                operation_delete.setText("删除");
                operation_delete.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/reduce.png"))));
                operation_delete.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                operation_delete.addActionListener(e -> delete_students());
                operation.add(operation_delete);

                //---- operation_search ----
                operation_search.setText("查找");
                operation_search.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/search.png"))));
                operation_search.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                operation_search.addActionListener(e -> search_students());
                operation.add(operation_search);

                //---- operation_revise ----
                operation_revise.setText("修改");
                operation_revise.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/change.png"))));
                operation_revise.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                operation_revise.addActionListener(e -> revise_students());
                operation.add(operation_revise);
            }
            menuBar1.add(operation);

            //======== export ========
            {
                export.setText("导出信息");
                export.setMinimumSize(null);
                export.setIcon(null);
                export.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- menuItem2 ---- 隐藏
                menuItem2.setText("导入学生信息");
                menuItem2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                menuItem2.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/import.png"))));
                menuItem2.setVisible(false);
                menuItem2.addActionListener(e -> import_students());
                export.add(menuItem2);

                //---- export_info ----
                export_info.setText("导出学生信息");
                export_info.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                export_info.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/export.png"))));
                export_info.addActionListener(e -> export_students());
                export.add(export_info);
            }
            menuBar1.add(export);

            //======== help_about ========
            {
                help_about.setText("帮助关于");
                help_about.setPreferredSize(null);
                help_about.setIcon(null);
                help_about.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

                //---- help_use ----
                help_use.setText("帮助");
                help_use.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                help_use.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/help.png"))));
                help_use.addActionListener(e -> helps());
                help_about.add(help_use);

                //---- about_use ----
                about_use.setText("关于");
                about_use.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                about_use.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/about.png"))));
                about_use.addActionListener(e -> about());
                help_about.add(about_use);
            }
            menuBar1.add(help_about);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setBorder(new EmptyBorder(2, 0, 0, 5));
                panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

                //---- refresh_button ----
                refresh_button.setText("刷新");
                refresh_button.setOpaque(true);
                refresh_button.setFont(new Font("宋体", Font.BOLD, 10));
                refresh_button.setIcon(null);
                refresh_button.addActionListener(e -> refresh());
                panel2.add(refresh_button);
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
                //---- table ----
                table.setBorder(new EmptyBorder(5, 10, 10, 10));
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table.setPreferredSize(null);
                new Set_Table(table, str_s, 0);
                table.setSurrendersFocusOnKeystroke(true);
                scrollPane1.setViewportView(table);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        setSize(710, 440);
        setLocationRelativeTo(null);

        refresh_button.setContentAreaFilled(false);
    }

}
