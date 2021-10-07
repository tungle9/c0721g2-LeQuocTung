package paradise_cenima;

import paradise_cenima.read_write_file.ReadWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    static Scanner scanner = new Scanner(System.in);
    private static List<Film> list = new ArrayList<>();

    static {
        Film film1 = new Film("5858","Batman","12/12/2012",100);
        Film film2 = new Film("213123","Spiderman","15/12/2012",100);
        list.add(film1);
        list.add(film2);
    }

    public void add() {
        System.out.println("mã phim");
        String maPhim = Validate.checkFilm(Validate.MASUATCHIEU,Validate.mess());
        System.out.println("nhập tên phim");
        String tenPhim = Validate.checkFilm(Validate.TENPHIM,"Chữ đầu phải viết hoa ");
        System.out.println("Ngày chiếu");
        String ngayChieu = Validate.checkFilm(Validate.NGAYCHIEU,"");
        System.out.println("Số lượng vé");
        int soVe = Integer.parseInt(Validate.checkFilm(Validate.NGAYCHIEU,""));
        Film film = new Film(maPhim,tenPhim,ngayChieu,soVe);
        list.add(film);
        ReadWrite.write(list);
    }
    public void show(){
        for (Film film :list) {
            System.out.println(film);
        }
    }
    public String delete(String ma){
        for(Film film : list){
            if(ma.equals(film.getMaPhim())){
                list.remove(film);
                return "Đã xóa ";
            }
        }
        return "Tên phim không có";
    }
}
