package _07_abstract_class_and_interface.excersice.resizeable;

public class Shapee implements Resizeable {


    @Override
    public double resize(double percent) {
//        double a = this. * percent;
        return 0;
    }

    private String color = "green";
    private boolean filled = true;

    public Shapee() {
    }

    public Shapee(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}