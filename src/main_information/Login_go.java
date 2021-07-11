package main_information;

import view.Main;
import javax.swing.*;

public class Login_go {
    String username;
    String password;

    public int go(){
        if (username.equals("1") && password.equals("1")) {
            Str_information strInformation = new Str_information();
            String[] a ={"2007310421","chen","nan","67","76","87","57"};
            strInformation.set_s(a);
            System.out.println("登录成功");
            new Main();
            return 0;
            //下一个窗口
        } else if (username.trim().length() == 0 || password.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "用户名或密码不能为空");
            return 1;
        } else {
            JOptionPane.showMessageDialog(null, "用户名或密码不正确");
            return 2;
        }
    }

    public Login_go(String username,String password){
        this.username=username;
        this.password=password;
    }
}
