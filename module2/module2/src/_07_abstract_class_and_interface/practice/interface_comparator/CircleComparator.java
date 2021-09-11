package _07_abstract_class_and_interface.practice.interface_comparator;

import _6_inheritance.practice.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> { /// Circle từ bài 6


    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius())
            return 1;
        else if (o1.getRadius() < o2.getRadius())
            return -1;
        else
            return 0;
    }
}
