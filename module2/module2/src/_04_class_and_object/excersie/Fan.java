package _04_class_and_object.excersie;

public class Fan {
    String color;
    int speed;
    boolean status;
    int radius;
int SLOW = 1 ;
int MEDIUM = 2 ;
int FAST = 3 ;
    public void speed() {
        System.out.println("speed of fan : " + SLOW);
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

    public void ToString() {
        System.out.printf("fan have color : %s ,speed :  %d", color, speed);
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.status = true;
        fan.status();
        fan.color = "blue";
        fan.speed();
        fan.ToString();
        System.out.println("");
        Fan fan1 = new Fan();
        fan1.status = false;
        fan1.status();
        fan1.color = "red";
        fan1.speed = 3;
        fan1.ToString();

    }
}
