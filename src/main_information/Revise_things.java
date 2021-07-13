package main_information;

import javax.swing.*;
import java.util.ArrayList;

public class Revise_things {
    int i; //存在i个学号相同
    int k;
    JTable table1;
    Str_information str_information = new Str_information();
    ArrayList<String[]> strings = str_information.get_s();

    public ArrayList<String[]> search(String number){
        int i=0;
        ArrayList<String[]> result =new ArrayList<>();
        if (number.length()==0){
            JOptionPane.showMessageDialog(null,"学号不能为空");
        }else {
            for (String[] string : strings) {
                if (string[0].equals(number)) {
                    if (i==0){
                        k=strings.indexOf(string);
                    }
                    result.add(string);
                    i++;
                }
            }
            if (i==0) JOptionPane.showMessageDialog(null,"没有找到该生信息");
            this.i=i;
        }
        return result;
    }

    public int set_information(String[] str_list,int index){
        System.out.println(this.k+index);
        str_information.modify(this.k+index,str_list);
        System.out.println(this.k+index);
        return 1;
    }

    public void set_Table(String[][] str_s){
        new Set_Table(table1,str_s);
    }

    public Revise_things(){

    }

}
