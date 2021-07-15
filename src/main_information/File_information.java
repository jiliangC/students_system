package main_information;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;


public class File_information {
    String_Function string_function = new String_Function();

    //判断文件是否存在
    public void create_file(File file_main) { //如果不存在则创建文件
        if (!file_main.exists()) {
            try {
                if (file_main.createNewFile()) {
                    System.out.println("文件创建成功");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //打开文件 还不用
    public void showFileOpenDialog() {
            final JFrame jf = new JFrame("打开");
            jf.setSize(400, 250);
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            // 创建一个默认的文件选取器
            JFileChooser fileChooser = new JFileChooser();
            // 设置默认显示的文件夹为当前文件夹
            fileChooser.setCurrentDirectory(new File("C://"));
            // 设置文件选择的模式（只选文件、只选文件夹、文件和文件均可选）
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            // 设置是否允许多选
            fileChooser.setMultiSelectionEnabled(false);
            // 设置默认使用的文件过滤器
            fileChooser.setFileFilter(new FileNameExtensionFilter("txt(*.txt)", "txt"));
            // 打开文件选择框（线程将被阻塞, 直到选择框被关闭）
            int result = fileChooser.showOpenDialog(jf);
            if (result == JFileChooser.APPROVE_OPTION) {
                // 如果点击了"确定", 则获取选择的文件路径
                File file = fileChooser.getSelectedFile();
                // 如果允许选择多个文件, 则通过下面方法获取选择的所有文件
                // File[] files = fileChooser.getSelectedFiles();
                //msgTextArea.append("打开文件: " + file.getAbsolutePath() + "\n\n");
            }
        }

    //保存文件
    public void showFileSaveDialog() {
        final JFrame jf = new JFrame("保存");
        jf.setSize(400, 250);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 创建一个默认的文件选取器
        JFileChooser fileChooser = new JFileChooser();

        // 设置打开文件选择框后默认输入的文件名
        fileChooser.setSelectedFile(new File("Students_info.txt"));
        // 打开文件选择框（线程将被阻塞, 直到选择框被关闭）
        int result = fileChooser.showSaveDialog(jf);
        if (result == JFileChooser.APPROVE_OPTION) {
            // 如果点击了"保存", 则获取选择的保存路径
            File file = fileChooser.getSelectedFile();
            create_file(file);
            write_to_file(string_function.get_s(),file);
            System.out.println(file.getAbsoluteFile());
            //msgTextArea.append("保存到文件: " + file.getAbsolutePath() + "\n\n");
        }
        }

    //将数组写入文本
    public void write_to_file(String[][] strings,File file) {
        FileWriter out = null;
        try {
            try {
                out = new FileWriter(file);
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

}
