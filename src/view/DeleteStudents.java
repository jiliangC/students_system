package view;
import main_information.Set_Table;
import main_information.String_Function;
import java.awt.*;
import java.util.Objects;
import javax.swing.*;


public class DeleteStudents extends JFrame {
    JTable table; //Main的table
    private JTextField num_text;

    public static void main(String[] args){new DeleteStudents(null);}

    public DeleteStudents(JTable table) {
        this.table=table;
        setVisible(true);
        setTitle("删除学生信息");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
        setResizable(false);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/students.png"))).getImage());
    }

    private void delete_go() {
        String number = num_text.getText();
        int index=-1;
        String_Function string_function = new String_Function();
        String[][] strings = string_function.get_s();
        for (int i=0;i<strings.length;i++){
            if (strings[i][0].equals(number)){
                index=1;
                int is_delete = JOptionPane.showConfirmDialog(null,"是否删除该学生信息","注意",JOptionPane.YES_NO_OPTION);
                if (is_delete==JOptionPane.YES_OPTION){
                    string_function.delete(i);
                    new Set_Table(table,string_function.get_s(),0);
                    dispose();
                }
                break;
            }
        }
        if (index==-1){
            JOptionPane.showMessageDialog(null,"未找到该学生信息");
        }
        // TODO add your code here
    }

    private void initComponents() {
        num_text = new JTextField();
        JLabel num_label = new JLabel();
        JButton delete = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- num_text ----
        num_text.setOpaque(false);
        contentPane.add(num_text);
        num_text.setBounds(85, 60, 150, 25);

        //---- num_label ----
        num_label.setText("学号");
        contentPane.add(num_label);
        num_label.setBounds(45, 60, 30, 25);

        //---- delete ----
        delete.setText("删除");
        delete.addActionListener(e -> delete_go());
        contentPane.add(delete);
        delete.setBounds(45, 105, 190, 25);

        contentPane.setPreferredSize(new Dimension(280, 190));
        pack();
        setLocationRelativeTo(getOwner());
        delete.setContentAreaFilled(false);
    }

}
