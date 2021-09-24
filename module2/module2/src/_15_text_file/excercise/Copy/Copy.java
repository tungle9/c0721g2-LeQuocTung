package _15_text_file.excercise.Copy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copy {
    public static List<String> read(String soucre) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(soucre);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);
            String line;
            while ((line = buf.readLine()) != null) {
                list.add(line);
            }
            buf.close();
        } catch (Exception e) {
            System.out.println("lỗi đọc file");
        }
        return list;
    }

    public static void writer(String target, List<String> String) {
        File file = new File(target);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw);
            for (String string : String) {
                br.write(string);
                br.newLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> list = read("src\\_15_text_file\\excercise\\Copy\\a.txt");
        writer("src\\_15_text_file\\excercise\\Copy\\b.txt", list);
    }
}