package main_information;

import java.util.ArrayList;

public class Str_information {
    public static
    ArrayList<String[]> str_a = new ArrayList();
    public  ArrayList<String[]> get_s(){
        return Str_information.str_a;
    }
    public void set_s(String[] strings){
        Str_information.str_a.add(strings);
    }


//    public static String[][] str_s=new String[10][7];
//
//    public  String[][] get_str() { ;
//        return Str_information.str_s;
//    }
//    public  void set_str(String[][] str_s) {
//       Str_information.str_s=str_s;
//    }
}
