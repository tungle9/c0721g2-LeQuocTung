package _15_io_text_file.excercise.country;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestCountry {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("src\\_15_io_text_file\\excercise\\country\\country.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] strings = line.split(",");
                int id = Integer.parseInt(strings[0]);
                String code = strings[1];
                String name = strings[2];
                countryList.add(new Country(id, code, name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
//        try {
//            String line;
//            BufferedReader br = new BufferedReader(new FileReader("src\\_15_io_text_file\\excercise\\country\\country.csv"));
//            while ((line = br.readLine()) != null) {
//                String[] strings = line.split(",");
//                int id = Integer.parseInt(strings[0]);
//                String code = strings[1];
//                String name = strings[2];
//                countryList.add(new Country(id, code, name));
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (Country country :countryList) {
//            System.out.println(country);
//        }
//    }
//}