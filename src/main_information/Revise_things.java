package main_information;

import javax.swing.*;
import java.util.ArrayList;

public class Revise_things {
    public ArrayList<String[]> search(String number){
        int i=0;
        Str_information str_information = new Str_information();
        ArrayList<String[]> strings = str_information.get_s();
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
        }
        return result;
    }
}