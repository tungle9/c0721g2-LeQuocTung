package _6_inheritance.excersie.Point_and_MoveablePoint;

import _6_inheritance.excersie.Point_and_MoveablePoint.MoveablePoint;

public class TestMove {
    public static void main(String[] args) {
        Point b = new Point(10,10);
        Point a = new MoveablePoint(50,60);
        System.out.println(a.toString());
        MoveablePoint mov = new MoveablePoint(4, 2); //x cha = 1 ;
        System.out.println(mov.toString());
        mov.move();  // + thêm 4 từ mov .
     //   mov.move().getX(); //+ 4
        System.out.println(mov.move().getX()); //=9
    }
}
