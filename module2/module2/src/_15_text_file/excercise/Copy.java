package _15_text_file.excercise;

import java.io.*;

public class Copy {
    public static void Copyfile(File a, File b) {
        try {
            FileInputStream inputStream = new FileInputStream(a);
            OutputStream outputStream = new FileOutputStream(b);
            byte[] buffer = new byte[1024];
            int line;
            while ((line = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0 , line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File a = new File("src\\_15_text_file\\excercise\\a");
        File b = new File("src\\_15_text_file\\excercise\\b");
        try{
            Copyfile(a,b);
            System.out.println("đã cóp thành công");
        } catch (Exception e) {
            System.out.println("bị lỗi hoặc file không tồn tại");
            e.printStackTrace();
        }
    }
}
