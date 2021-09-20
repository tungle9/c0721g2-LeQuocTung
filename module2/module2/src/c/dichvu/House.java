package c.dichvu;

import c.dichvu.Service;

public class House extends Service {
    private String tieuChuan;
    private int soTang;
    public House(String tieuChuan, double dienTichhoBoi, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }
    public House(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue) {
//        this.tieuChuan = tieuChuan;
//        this.dienTichhoBoi = dienTichhoBoi;
//        this.soTang = soTang;
        super(dichVu, dienTichsuDung, chiPhi, soLuong, kieuThue);
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public House() {
        super();
    }

    @Override
    public String getDichVu() {
        return super.getDichVu();
    }

    @Override
    public void setDichVu(String dichVu) {
        super.setDichVu(dichVu);
    }

    @Override
    public double getDienTichsuDung() {
        return super.getDienTichsuDung();
    }

    @Override
    public void setDienTichsuDung(double dienTichsuDung) {
        super.setDienTichsuDung(dienTichsuDung);
    }

    @Override
    public double getChiPhi() {
        return super.getChiPhi();
    }

    @Override
    public void setChiPhi(double chiPhi) {
        super.setChiPhi(chiPhi);
    }

    @Override
    public int getSoLuong() {
        return super.getSoLuong();
    }

    @Override
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong);
    }

    @Override
    public String getKieuThue() {
        return super.getKieuThue();
    }

    @Override
    public void setKieuThue(String kieuThue) {
        super.setKieuThue(kieuThue);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
