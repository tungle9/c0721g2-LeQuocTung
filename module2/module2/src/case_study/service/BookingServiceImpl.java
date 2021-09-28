package case_study.service;
import case_study.models.Booking;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements  BookingService  {
    private static TreeSet<Booking> treeSet = new TreeSet<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        Booking booking = new Booking(123,15,16,CustomerServiceImpl.list.get(0),FacilityServiceImpl.getFacility("House"));
        Booking booking1 = new Booking(321,15,16,CustomerServiceImpl.list.get(1),FacilityServiceImpl.getFacility("Room"));
        treeSet.add(booking);
        treeSet.add(booking1);
    }

    public static void show(){
        for(Booking booking : treeSet){
            System.out.println(booking);
        }
    }

//    public static void main(String[] args) {
//        Collections.sort(treeSet,new Booking());
//    }
}
