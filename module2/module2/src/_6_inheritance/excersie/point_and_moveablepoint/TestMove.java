package _6_inheritance.excersie.point_and_moveablepoint;

import java.util.Arrays;

public class TestMove {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        System.out.println(point);
//        point.setXY(2,3);
//        System.out.println(Arrays.toString(point.getXY()));
        MoveablePoint move = new MoveablePoint(15, 20);
        System.out.println(move.toString());
        move.setX(2);
        move.setY(3);
        move.setXSpeed(4);
        move.setYSpeed(5);
        System.out.println(move.move());
    }
}
