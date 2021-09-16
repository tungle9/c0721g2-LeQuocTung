package abc.Students;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        int choice = 1;
        while (choice != 0){
            System.out.println("MENU");
            System.out.println("1. thêm sv");
            System.out.println("2. in sv");
            System.out.println("0. Exit");
            int login = scanner.nextInt();
            scanner.nextLine();
            switch (login) {
                case 1:
                    System.out.println("Tên");
                    String ten = scanner.nextLine();
                    System.out.println("MSV");
                    int msv = scanner.nextInt();
                    System.out.println("Năm sinh");
                    int born = scanner.nextInt();
                    System.out.println("điểm");
                    double point = scanner.nextDouble();
                    ManangerStudents manangerStudents = new ManangerStudents(ten, msv, born, point);
                    students.add(manangerStudents);
                case 2:  // in ra danh sách
                 students.show();
                case 3 : // kiểm tra có rỗng hay không
                    System.out.println(students.check());
                case 4 : // tổng các sinh viên
                    System.out.println(students.result());
                case 0:
                    System.out.println("exit");
            }
        }
    }
}
