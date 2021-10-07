package paradise_cenima.read_write_file;

import paradise_cenima.Film;
import sun.nio.ch.FileKey;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ReadWrite {
    static final File FILE = new File("paradise_cenima\\cenima.csv");
    static Scanner scanner = new Scanner(System.in);

    public static void write(List<Film> list) {
        try {
            FileWriter writer = new FileWriter(FILE);
            BufferedWriter br = new BufferedWriter(writer);

            for(Film film : list){
                br.write(film.film());
                br.newLine();
            }
            br.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}