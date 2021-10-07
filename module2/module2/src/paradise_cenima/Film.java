package paradise_cenima;

public class Film {
    private String maPhim;
    private String tenPhim;
    private String ngayChieu;
    private int soLuongVe;

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(String ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public Film(String maPhim, String tenPhim, String ngayChieu, int soLuongVe) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.soLuongVe = soLuongVe;
    }

    @Override
    public String toString() {
        return "List{" +
                "maPhim=" + maPhim +
                ", tenPhim='" + tenPhim + '\'' +
                ", ngayChieu='" + ngayChieu + '\'' +
                ", soLuongVe=" + soLuongVe +
                '}';
    }
    public String film(){
        return "tên phim "+ getTenPhim() +",mã phim" + getMaPhim() + ",ngày chiếu " +getNgayChieu()+ ",số lượng vé" + getSoLuongVe();
    }
}
