package _16_binary_file_serialization.excercise;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String maker;
    private double price;

    public Product(int code, String name, String maker, double price) {
        this.code = code;
        this.name = name;
        this.maker = maker;
        this.price = price;
    }

    public Product() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", price=" + price +
                '}';
    }
}
