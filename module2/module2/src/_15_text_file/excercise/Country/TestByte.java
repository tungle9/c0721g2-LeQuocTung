package _15_text_file.excercise.Country;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestByte {
    public static void main(String[] args) {
        try {
            File file = new File("src\\_15_text_file\\excercise\\Country\\country.csv");
            FileInputStream fm = new FileInputStream(file);
            ObjectInputStream om = new ObjectInputStream(fm);
            Country country = (Country) om.readObject();
            fm.close();
            om.close();
            System.out.println(country);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
