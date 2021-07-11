package main_information;

import javax.swing.*;
import java.util.ArrayList;

public class AddStudents {
    int i = 0;
    private static boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public int j(){
        return this.i;
    }

    public AddStudents(String number,String name,String sex,String chinese,String math,String english){
        Str_information str_information=new Str_information();
        int judge = 0;
        for (String[] strings1:str_information.get_s()){
            if (strings1[0].equals(number)){
                judge=1;
            }
        }

        if (name.equals("") || chinese.equals("") || math.equals("") || english.equals("")) {
            JOptionPane.showMessageDialog(null, "不能留空");
        } else if (!isNumeric(number) || number.length() != 10) {
            JOptionPane.showMessageDialog(null, "学号格式不正确");
        } else if (!isNumeric(chinese) || chinese.length() >= 4) {
            JOptionPane.showMessageDialog(null, "语文成绩格式不正确");
        } else if (!isNumeric(math) || math.length() >= 4) {
            JOptionPane.showMessageDialog(null, "数学成绩格式不正确");
        } else if (!isNumeric(english) || english.length() >= 4) {
            JOptionPane.showMessageDialog(null, "英语成绩格式不正确");
        } else if (judge==1){
            JOptionPane.showMessageDialog(null,"学号已经存在");
        }
        else {
            int ch = Integer.parseInt(chinese);
            int ma = Integer.parseInt(math);
            int en = Integer.parseInt(english);
            String info = "已添加\n" + "姓名 " + name + "\n" + "学号 " + number + "\n" + "性别 " + sex + "\n" + "语文 " + chinese + "  " + "数学 " + math + "  " + "英语 " + english;
            JOptionPane.showMessageDialog(null, info);
            String[] a ={number,name,sex,chinese,math,english,String.valueOf(ch+ma+en)};
            this.i=1;
            str_information.set_s(a);

            // TODO add your code
        }

    }
}
