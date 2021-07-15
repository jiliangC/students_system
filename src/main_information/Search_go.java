package main_information;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.ArrayList;

public class Search_go {
    private JTable table1;

    public  String[][] get_result(String number,  String name){
        String_Function string_function = new String_Function();
        String[][] strings = string_function.get_s();
        String[][] result = new String[0][7];
        int a=number.length(); //学号
        int b=name.length(); //名字
        int i =0;
        if (a!=0&&b==0){ //只有学号
            for (String[] string : strings) {
                if (string[0].equals(number)) {
                    result=string_function.add(result,string);
                    i++;
                }
            }
            if (i==0) JOptionPane.showMessageDialog(null,"没有找到该生信息");
        }else if (a==0&&b!=0){ //只有名字
            for (String[] string : strings) {
                if (string[1].equals(name)) {
                    result=string_function.add(result,string);
                    i++;
                }
            }
            if (i==0) JOptionPane.showMessageDialog(null,"没有找到该生信息");
        }else{ //名字和学号
            for (String[] string : strings){
                if (string[0].equals(number)&&string[1].equals(name)){
                    result=string_function.add(result,string);
                    i++;
                }
            }
            if (i==0) JOptionPane.showMessageDialog(null,"没有找到该生信息");
        }
        return result;
    }

    public void set_Table(String[][] str_s){
        new Set_Table(table1,str_s,0);
    }

    public Search_go(JTable jTable){
        this.table1=jTable;
    }
}
