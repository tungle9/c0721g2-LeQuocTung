package c.models;

import c.dichvu.Customer;
import c.dichvu.Facility;

public class Booking {
    private int maBooking ;
    private double batDau;
    private double ketThuc;
    private int maKhachhang;
    private String dichVu;
    private Facility facility;
    private Customer customer;
    private String loaiDichvu;
    public Booking(){
    }

    public Booking(int maBooking, double batDau, double ketThuc, int maKhachhang, String dichVu, Facility facility, Customer customer, String loaiDichvu) {
        this.maBooking = maBooking;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.maKhachhang = maKhachhang;
        this.dichVu = dichVu;
        this.facility = facility;
        this.customer = customer;
        this.loaiDichvu = loaiDichvu;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public double getBatDau() {
        return batDau;
    }

    public void setBatDau(double batDau) {
        this.batDau = batDau;
    }

    public double getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(double ketThuc) {
        this.ketThuc = ketThuc;
    }

    public int getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(int maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public String getLoaiDichvu() {
        return loaiDichvu;
    }

    public void setLoaiDichvu(String loaiDichvu) {
        this.loaiDichvu = loaiDichvu;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
