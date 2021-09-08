package _04_class_and_object.excersie;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    private double start, endTime;

    public double getStart() {
        return start;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        start = System.currentTimeMillis();
    }

    public void endTime() {
        endTime = System.currentTimeMillis();
    }

    public double stop() {
        double result = endTime - start;
        return result;
    }
}
    ///////
