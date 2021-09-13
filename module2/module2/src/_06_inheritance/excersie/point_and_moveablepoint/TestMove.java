package _06_inheritance.excersie.point_and_moveablepoint;

public class TestMove {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        System.out.println(point);
        MoveablePoint move = new MoveablePoint(15, 20);
        move.setX(2);
        move.setY(3);
        System.out.println(move.toString());
        move.setX(2);
        move.setY(3);
        move.setXSpeed(4);
        move.setYSpeed(5);
        System.out.println(move.move());
    }
}
