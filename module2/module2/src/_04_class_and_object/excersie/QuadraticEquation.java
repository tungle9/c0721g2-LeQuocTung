package _04_class_and_object.excersie;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double delta() {
        double result = b * 2 - 4 * a * c;
        return result;
    }
    double getRoot1() {
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        return r1;

    }
    double getRoot2() {
        double r2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
        return r2;
    }
    void getDiscriminant() {
        double delta = b * 2 - 4 * a * c;
        if (delta >= 0) {
            System.out.println("nghiệm 1 là : "+getRoot1());
            System.out.println("nghiệm 2 là :"+getRoot2());
        } else if (delta == 0) {
            System.out.println("nghiệm là : "+getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
    public static void main(String[] args) {
        QuadraticEquation qua = new QuadraticEquation(1, 15, 2);
        System.out.println(qua.delta());
        qua.getDiscriminant();
    }
}
