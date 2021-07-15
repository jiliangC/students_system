package main_information;

import javax.swing.*;

public class Revise_things {
    static int i; //存在i个学号相同
    static int k;
    String_Function string_function = new String_Function();
    String[][] strings = string_function.get_s();

    public String[][] search(String number){
        int i=0;
        String[][] result = new String[0][7];
        if (number.length()==0){
            JOptionPane.showMessageDialog(null,"学号不能为空");
        }else {
            for (int j=0;j<strings.length;j++){
                if (strings[j][0].equals(number)){
                    if (i==0){
                        k=j;
                    }
                    result= string_function.add(result,strings[j]);
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
        string_function.modify(k+index,str_list);
        System.out.println(k+index);
        return 1;
    }

}
