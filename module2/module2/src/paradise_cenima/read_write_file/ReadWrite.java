package paradise_cenima.read_write_file;

import paradise_cenima.Film;
import sun.nio.ch.FileKey;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWrite {
    static final File FILE = new File("paradise_cenima\\cenima.csv");
    static Scanner scanner = new Scanner(System.in);

    public static void write(List<Film> list) {
        try {
            FileWriter writer = new FileWriter(FILE);
            BufferedWriter br = new BufferedWriter(writer);

            for (Film film : list) {
                br.write(film.film());
                br.newLine();
            }
            br.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Film> read() {
        List<Film> filmList = new ArrayList<>();

        try {
            FileReader reader = new FileReader(FILE);
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] strings = line.split(",");
                String maPhim = strings[0];
                String tenPhim = strings[1];
                String ngayChieu = strings[2];
                int soVe = Integer.parseInt(strings[3]);
                Film film = new Film(maPhim, tenPhim, ngayChieu, soVe);
                filmList.add(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filmList;
    }
}