package _07_abstract_class_and_interface.excersice.colorable;

public class Test {
    public static void main(String[] args) {
        System.out.println("ban đầu");
        Shapee[] shapees = new Shapee[3];
        shapees[0] = new Circlee(5);
        shapees[1] = new Rectanglee(10, 20);
        shapees[2] = new Squaree(10);
        for (Shapee shapee : shapees) {
            if (shapee instanceof Circlee) {
                System.out.println(((Circlee) shapee).getArea());
            } else if (shapee instanceof Squaree) {
                System.out.println(((Squaree) shapee).getArea());
            } else {
                System.out.println(((Rectanglee) shapee).getArea());
            }
        }
        System.out.println("/////////////Sau///////////////");
        for (Shapee shapee : shapees) {
            if (shapee instanceof Circlee) {
                System.out.println(((Circlee) shapee).getArea());
            } else if (shapee instanceof Squaree) {
                System.out.println(((Squaree) shapee).howtoColor()+((Squaree) shapee).getArea());
            } else if (shapee instanceof Rectanglee) {
                System.out.println(((Rectanglee) shapee).getArea());
            }
        }
    }
}
