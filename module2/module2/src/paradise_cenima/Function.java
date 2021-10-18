package paradise_cenima;

import paradise_cenima.read_write_file.ReadWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Function {
    static Scanner scanner = new Scanner(System.in);
    private static List<Film> list = new ArrayList<>();

//    public String checkMa() {
//
//        String value = "";
//        for (Film film : list) {
//            while (true) {
//                value = scanner.nextLine();
//                if (!film.getMaPhim().equals(value)) {
//                    if (Pattern.matches(Validate.MASUATCHIEU,value)) {
//                        break;
//                    }
//                } else {
//                    System.out.println("tên bạn nhập đã trùng mời bạn nhập lại");
//                }
//            }
//        }
//        return value;
//    }

    public void add() {
        System.out.println("mã phim");
        String maPhim = Validate.checkFilm(Validate.MASUATCHIEU,Validate.mess());
        System.out.println("nhập tên phim");
        String tenPhim = Validate.checkFilm(Validate.TENPHIM, "Chữ đầu phải viết hoa ");
        System.out.println("Ngày chiếu");
        String ngayChieu = Validate.checkFilm(Validate.NGAYCHIEU, "");
        System.out.println("Số lượng vé");
        int soVe = Integer.parseInt(Validate.checkFilm(Validate.NGAYCHIEU, ""));
        Film film = new Film(maPhim, tenPhim, ngayChieu, soVe);
        list.add(film);
        ReadWrite.write(list);
    }

    public void show() {
        list = ReadWrite.read();
        for (Film film : list) {
            System.out.println(film);
        }
    }

    public String delete(String ma) {
        for (Film film : list) {
            if (film.getMaPhim().equals(ma)) {
                System.out.println("bạn có chắc xóa không \n" +
                        "ấn 1 nếu bạn muốn xóa \n" +
                        "ấn 2 nếu bạn không muốn xóa");
                int login = scanner.nextInt();
                if (login == 1) {
                    list.remove(film);
                    ReadWrite.write(list);
                    return "Đã xóa ";
                }

            }
        }
        return "Tên phim không có hoặc bạn không muốn xóa";
    }
}