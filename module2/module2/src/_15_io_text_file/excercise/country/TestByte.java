package _15_io_text_file.excercise.country;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class TestByte {
    public static void main(String[] args) {
        File file = new File("src\\_15_text_file\\excercise\\Country\\country.csv");
        try {
            List<String> list = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
         for(String line : list){
             System.out.println(line);
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
