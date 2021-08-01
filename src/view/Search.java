package view;

import main_information.Search_go;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Objects;

public class Search extends JFrame {

    private JTextField num_text;
    private JTextField name_text;
    private JTable table;

    public static void main(String[] args) {
        new Search();
    }

    public Search() {
        setTitle("学生信息查询");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }


    private void searcher() {
        String number = num_text.getText();
        String name = name_text.getText();
        Search_go search_go = new Search_go(table);
        String[][] str_s = search_go.get_result(number, name);
        search_go.set_Table(str_s);
        // TODO add your code here
    }

    private void initComponents() {

        num_text = new JTextField();
        JLabel num_label = new JLabel();
        name_text = new JTextField();
        JLabel name_label = new JLabel();
        JScrollPane scrollPane1 = new JScrollPane();
        table = new JTable();
        JButton searcher_button_button = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- num_text ----
        num_text.setOpaque(false);
        contentPane.add(num_text);
        num_text.setBounds(65, 20, 120, 25);

        //---- num_label ----
        num_label.setText("学号");
        num_label.setFont(new Font("宋体", Font.BOLD, 12));
        contentPane.add(num_label);
        num_label.setBounds(30, 20, 35, 25);

        //---- name_text ----
        name_text.setOpaque(false);
        contentPane.add(name_text);
        name_text.setBounds(265, 20, 120, 25);

        //---- name_label ----
        name_label.setText("姓名");
        name_label.setFont(new Font("宋体", Font.BOLD, 12));
        contentPane.add(name_label);
        name_label.setBounds(230, 20, 35, 25);

        //======== scrollPane1 ========
        {

            //---- table ----
            table.setModel(new DefaultTableModel(
                    new Object[][]{
                    },
                    new String[]{
                            "学号", "姓名", "性别", "语文", "数学", "英语", "总分"
                    }
            ));
            table.setSurrendersFocusOnKeystroke(true);
            table.setCellSelectionEnabled(true);
            scrollPane1.setViewportView(table);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(30, 65, 560, 225);

        //---- searcher_button ----
        searcher_button_button.setText("搜索");
        searcher_button_button.setFont(new Font("宋体", Font.BOLD, 12));
        searcher_button_button.addActionListener(e -> searcher());
        contentPane.add(searcher_button_button);
        searcher_button_button.setBounds(530, 20, 60, 25);

        contentPane.setPreferredSize(new Dimension(620, 315));
        pack();
        setLocationRelativeTo(getOwner());
        searcher_button_button.setContentAreaFilled(false);
    }

}
