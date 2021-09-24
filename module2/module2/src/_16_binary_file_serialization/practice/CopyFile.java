package _16_binary_file_serialization.practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public class CopyFile {
//    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
//        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//    }

    private static void copyFileUsingStream(File source, File dest) {
        InputStream is;
        OutputStream os;
        try {
            is = new FileInputStream(source); //đọc dữ liệu
            os = new FileOutputStream(dest); // ghi dữ liệu
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            is.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File sourceFile = new File("src\\_16_binary_file_serialization\\practice\\abc.text");
        File destFile = new File("src\\_16_binary_file_serialization\\practice\\bca.text");
        try {
//            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile, destFile);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
