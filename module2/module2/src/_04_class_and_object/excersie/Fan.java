package _04_class_and_object.excersie;

public class Fan {
    String color;
    int speed;
    boolean status;
    int radius;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public void speed(int a  ) {
        System.out.println("speed of fan : " + a );
    }

    public void status() {
        if (status == false) {
            System.out.println("fan turn off");
        } else {
            System.out.println(" fan turn on ");
        }
    }

    public void radius() {
        System.out.println("radius = " + radius);
    }

    public void color() {
        System.out.println("color " + color);
    }

    public  String toString() {
        if (status == true) {
            System.out.print("fan have color "+color+"speed : "+ speed+ "radius :"+ radius +"fan is on speed: "+speed );
        }   if (status == false) {
            System.out.print("fan have color :"+color+  "radius :"+ radius +"fan is off" );
        }
   return "" ;
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.status = true;
        fan1.color = "red";
       fan1.speed(FAST);
        fan1.radius = 5;
       fan1.toString();
    }
}
