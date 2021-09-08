package _04_class_and_object.excersie;

public class Fan {
    String color;
    int speed;
    boolean status;
    int radius;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    public void status() {
        if (status == false) {
            System.out.println("fan turn off");
        } else {
            System.out.println(" fan turn on ");
        }
    }

    public int radius() {
       return radius ;
    }

    public String color() {
      return color ;
    }

    public String toString() {
        if (status == true) {
            System.out.print("fan have color " + color + "speed : " + speed + "radius :" + radius + "fan is on speed: " + speed);
        }
        if (status == false) {
            System.out.print("fan have color :" + color + ",radius :" + radius + ",fan is off");
        }
        return "";
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.status = true;
        fan1.color = "red";
        fan1.speed = FAST ;
        fan1.radius = 5;
        fan1.toString();
        System.out.println("");
        Fan fan2 = new Fan();
        fan2.status = false;
        fan2.color = "blue";
        fan2.speed= SLOW ;
        fan2.radius = 5;
        fan2.toString();
    }
}
