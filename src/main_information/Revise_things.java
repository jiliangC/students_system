package main_information;

import javax.swing.*;
import java.util.ArrayList;

public class Revise_things {
    static int i; //存在i个学号相同
    static int k;
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
            Revise_things.i =i;
        }
        return result;
    }

    public int set_information(String[] str_list,int index){
        System.out.println(k+index);
        str_information.modify(k+index,str_list);
        System.out.println(k+index);
        return 1;
    }

}
