package _04_class_and_object.excersie;

import java.time.LocalTime;

public class StopWatch {
    LocalTime start, endTime;
    int a, b;

    public void start() {
        start = LocalTime.now();
        System.out.println("watch start :" + start);
    }

    public void stop() {
        endTime = LocalTime.now();
        System.out.println("watch stop" + endTime);
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int get() {
        int second = (start.getHour() - endTime.getHour()) * 3600;
        return second;
    }
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();

    }
}
