package _07_abstract_class_and_interface.excersice.resizeable;

public class Test {
    public static void main(String[] args) {
        Shapee[] shapees = new Shapee[3];
        shapees[0] = new Circlee(2);
        shapees[1] = new Rectanglee(5, 10);
        shapees[2] = new Squaree(7);
        System.out.println("Ban đầu");
        for (Shapee shapee : shapees) {
            if (shapee instanceof Circlee) {
                System.out.println((((Circlee) shapee).getArea()));
            }
            if (shapee instanceof Squaree) {
                System.out.println((((Squaree) shapee).getArea()));
            } else if (shapee instanceof Rectanglee) {
                System.out.println((((Rectanglee) shapee).getArea()));
            }
        }
        System.out.println("/////////////Sau///////////////");
        double per = (Math.random() * 100) / 100;
        for (Shapee shapee : shapees) {
            if (shapee instanceof Circlee) {
                System.out.println(shapee.resize(per));
            } else if (shapee instanceof Squaree) {
                System.out.println(shapee.resize(per));
            } else if (shapee instanceof Rectanglee) {
                System.out.println(shapee.resize(per));
            }
        }
    }
}
