package _04_class_and_object.excersie;

public class Fan {
    String color ;
    int speed;
    boolean status;
    int radius ;
public void speed(){
    System.out.println("spped"+ this.speed);
}
public void status ( ){
    if (this.status = false ){
        System.out.println("fan turn off");}
        else{
        System.out.println(" fan turn on  ");
        }
}
public void radius( ){
    System.out.println("radius = " + this.radius);

}
public void color(){
    System.out.println("color "+ this.color);
}

    public static void main(String[] args) {
     Fan fan = new Fan();
   fan.status = true ;
   fan.color();
   fan.speed();
    }
}
