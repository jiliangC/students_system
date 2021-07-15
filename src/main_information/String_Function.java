package main_information;

import java.io.*;

public class String_Function {
    public static
    String[][] str_a = new String[0][7];
    File file = new File("src/students_info");

    public  String[][] add(String[][] str_a,String[] n){
        String[][] temp = new String[str_a.length+1][7];
        for (int i=0;i<str_a.length;i++){
            temp[i]=str_a[i];
        }
        temp[str_a.length]=n;
        return temp;
    }
    private String[][] reduce(int index,String[][] str_a){
        String[][] temp = new String[str_a.length-1][7];
        int j=0;
        for (int i=0;i<str_a.length;i++){
            if (i!=index){
                temp[j++]=str_a[i];
            }
        }
        return temp;
    }

    public String[][] get_s(){return String_Function.str_a;}
    public void set_s(String[] strings){
        String_Function.str_a=add(String_Function.str_a,strings);
        write_to_file(String_Function.str_a);
    }
    public void replace(String[][] strings){
        String_Function.str_a=strings;
        write_to_file(String_Function.str_a);
    }
    public void modify(int index,String[] strings){
        String_Function.str_a[index]=strings;
        write_to_file(String_Function.str_a);
    }
    public void delete(int index){
        String_Function.str_a=reduce(index,String_Function.str_a);
    }

    //将数组写入文本
    private void write_to_file(String[][] strings) {
        FileWriter out = null;
        try {
            try {
                out = new FileWriter(this.file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //二维数组按行存入到文件中
            for (String[] strings1 : strings) {
                for (String str : strings1) {
                    assert out != null;
                    out.write(str + "\t");
                }
                assert out != null;
                out.write("\r\n");
            }
            assert out != null;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //将文本写入数组
    public void read_from_file() {
        BufferedReader bufferedReader;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            //执行读取
            while ((line = bufferedReader.readLine()) != null) {
                //将按行读取的字符串按空格分割，得到一个string数组
                String[] strings = line.split("\t");
                String_Function.str_a=add(String_Function.str_a,strings);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
