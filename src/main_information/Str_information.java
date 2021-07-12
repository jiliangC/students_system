package main_information;
import java.io.*;
import java.util.ArrayList;

public class Str_information {
    public static
    ArrayList<String[]> str_a = new ArrayList<>();
    File file = new File("src/students_info");

    public  ArrayList<String[]> get_s(){
        return Str_information.str_a;
    }
    public void set_s(String[] strings){
        Str_information.str_a.add(strings);
        write_to_file(str_a);
    }
    public void replace(ArrayList<String[]> strings){
        Str_information.str_a=strings;
        write_to_file(str_a);
    }
    public void modify(int index,String[] strings){
        Str_information.str_a.set(index,strings);
        write_to_file(str_a);
    }

    //将数组写入文本
    private void write_to_file(ArrayList<String[]> strings) {
        FileWriter out = null;
        try {
            try {
                out = new FileWriter(this.file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //二维数组按行存入到文件中
            for (String[] strings1:strings){
                for (String str :strings1){
                    out.write(str+"\t");
                }
                out.write("\r\n");
            }
            assert out != null;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //将文本写入数组
    public void read_from_file(){
        BufferedReader bufferedReader;
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            //执行读取
            while((line = bufferedReader.readLine() )!= null){
                    //将按行读取的字符串按空格分割，得到一个string数组
                    String[] strings = line.split("\t");
                    Str_information.str_a.add(strings);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
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
