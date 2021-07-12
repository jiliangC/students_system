package main_information;

import javax.swing.*;
import java.util.ArrayList;

public class Revise_things {
    int i;
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
                    result.add(string);
                    i++;
                }
                if (i==0) JOptionPane.showMessageDialog(null,"没有找到该生信息");
            }
            this.i=i;
        }
        return result;
    }

    public int set_information(String[] str_list){
        strings.set(this.i-1,str_list);
        return 1;
    }
}
