package abc.Students;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        int choice = 1;
        while (choice != 0) {
            System.out.println("MENU");
            System.out.println("1. thêm sv");
            System.out.println("2. in sv");
            System.out.println("3. kiểm tra danh sách ");
            System.out.println("4. Tổng các sv");
            System.out.println("5. Làm rỗng danh sách");
            System.out.println("6. Tìm kiếm sinh viên bằng Tên");
            System.out.println("7. xóa sinh viên");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Tên");
                    String name = scanner.nextLine();
                    System.out.println("MSV");
                    int msv = scanner.nextInt();
                    System.out.println("Năm sinh");
                    int born = scanner.nextInt();
                    System.out.println("điểm");
                    double point = scanner.nextDouble();
                    ManangerStudents manangerStudents = new ManangerStudents(name, msv, born, point);
                    students.add(manangerStudents);
                    break;
                case 2:  // in ra danh sách
                    students.show();
                    break;
                case 3: // kiểm tra có rỗng hay không
                    System.out.println(students.check());
                    break;
                case 4: // tổng các sinh viên
                    System.out.println("số lượng hiện tại :" + students.result());
                    break;
                case 5: // làm rỗng danh sách
                    students.clear();
                    break;
                case 6: // tìm kiếm
                    System.out.println("Tên");
                     name = scanner.nextLine();
                    students.serach(name);
                    break;
                case 7 :
                    System.out.println("Nhập mã sinh viên bạn muốn xóa ");
                    msv  = scanner.nextInt();
                    ManangerStudents sv = new ManangerStudents(msv);
                    students.delete(sv);
                    break;
                case 0:
                    System.out.println("exit");
                    break;
            }
        }
    }
}
