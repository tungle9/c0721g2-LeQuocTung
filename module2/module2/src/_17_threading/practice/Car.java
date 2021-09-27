package _17_threading.practice;
import java.util.Random;
import static _17_threading.practice.Main.DISTANCE;
import static _17_threading.practice.Main.STEP;

public class Car implements Runnable {
    private  String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // km ban đầu
        int runDistance  = 0;
        // thời gian bắt đầu đua
        long startTime  = System.currentTimeMillis();
        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "m";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("car" + this.name + ":" + log + " " + Math.min(DISTANCE, runDistance)+"KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                e.printStackTrace();
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}