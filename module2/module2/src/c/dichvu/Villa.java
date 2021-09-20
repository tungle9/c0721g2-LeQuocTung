package c.dichvu;

public class Villa extends House{
    private double dienTichhoBoi;
    public Villa(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue, double dienTichhoBoi) {
        super(dichVu, dienTichsuDung, chiPhi, soLuong, kieuThue);
        this.dienTichhoBoi = dienTichhoBoi;
    }

    public Villa(double dienTichhoBoi) {
        this.dienTichhoBoi = dienTichhoBoi;
    }

    public double getDienTichhoBoi() {
        return dienTichhoBoi;
    }
    public Villa(){

    }

    public void setDienTichhoBoi(double dienTichhoBoi) {
        this.dienTichhoBoi = dienTichhoBoi;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
