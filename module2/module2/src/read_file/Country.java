package read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Country implements Serializable {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void write() {

        File file = new File("src\\read_file\\country.dat");
        try {
            FileOutputStream fm = new FileOutputStream(file, true);
            ObjectOutput ob = new ObjectOutputStream(fm);
            Country country = new Country(123, "333", "DN");
            Country country1 = new Country(1234, "3333", "DnN");
            List<Country> list = new ArrayList<>();
            list.add(country);
            list.add(country1);
            ob.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try {
            FileInputStream fm1 = new FileInputStream("src\\read_file\\country.dat");
            ObjectInputStream om1 = new ObjectInputStream(fm1);
            ArrayList<Country> list = (ArrayList<Country>) om1.readObject();
            for (Country country3 : list) {
                System.out.println(country3);
            }
//            System.out.println(country1);
//            System.out.println(country);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } //catch (ClassNotFoundException e) {
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // e.printStackTrace();
        //   }
    }

    public static void main(String[] args) {
      //  write();
      read();
    }
}