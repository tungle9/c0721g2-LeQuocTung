package c.controllers;

import c.dichvu.Employee;
import c.service.EmployeeService;
import c.service.EmployeeServiceImpl;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chương trình");
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int login = 0;
        int login1;
        do {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            login = scanner.nextInt();
            switch (login) {
                case 1:
                    System.out.println("1.display");
                    System.out.println("2.Add new employee");
                    System.out.println("3.Edit employee");
                    System.out.println("4.return main menu ");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1: // hiển thị
                            employeeService.show();
                            break;
                        case 2:  // them đối tượng
                            System.out.println("Họ và tên");
                            String name = scanner.nextLine();
                            System.out.println("Trình độ");
                            String trinhDo = scanner.nextLine();
                            System.out.println("lương");
                            double luong = scanner.nextDouble();
                            System.out.println("mã nhân viên ");
                            int mnv = scanner.nextInt();
                            System.out.println("năm sinh ");
                            int namSinh = scanner.nextInt();
                            System.out.println("GIỚI TÍNH");
                            String gioiTinh = scanner.nextLine();
                            System.out.println("cmnd");
                            int cmnd = scanner.nextInt();
                            System.out.println("số điện thoại");
                            int sdt = scanner.nextInt();
                            System.out.println("email");
                            String email = scanner.nextLine();
                            Employee employee = new Employee(name, namSinh, gioiTinh, cmnd, sdt, email, mnv, trinhDo, luong);
                            employeeService.add(employee);
                            break;
                        case 3:  // edit theo tên
                            String name1 = scanner.nextLine();
                            employeeService.edit(name1);
                            break;
                        case 4: // về lại menu
                            System.out.println("về lại menu");
                            break;
                    }
                case 2:
                    System.out.println("1.Display list customers");
                    System.out.println("2.add new customers");
                    System.out.println("3.\tEdit customer");
                    System.out.println("4.\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        case 4:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility");
                    System.out.println("2\tAdd new facility");
                    System.out.println("3\tDisplay list facility maintenance");
                    System.out.println("4\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:
                            System.out.println("1\tDisplay list facility");
                            break;

                        case 2:
                            System.out.println("2\tAdd new facility");
                            break;

                        case 3:
                            System.out.println("3\tDisplay list facility maintenance");
                            break;

                        case 4:
                            System.out.println("4\tReturn main menu");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking");
                    System.out.println("2.\tDisplay list booking");
                    System.out.println("3.\tCreate new constracts");
                    System.out.println("4.\tDisplay list contracts");
                    System.out.println("5.\tEdit contracts");
                    System.out.println("6.\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:
                            System.out.println("1.\tAdd new booking");
                            break;

                        case 2:
                            System.out.println("2.\tDisplay list booking");
                            break;

                        case 3:
                            System.out.println("3.\tCreate new constracts");
                            break;

                        case 4:
                            System.out.println("4.\tDisplay list contracts");
                            break;
                        case 5:
                            System.out.println("5.\tEdit contracts");
                            break;
                        case 6:
                            System.out.println("6.\tReturn main menu");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service");
                    System.out.println("2.\tDisplay list customers get voucher");
                    System.out.println("3.\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:
                            System.out.println("1.\tDisplay list customers use service");

                            break;

                        case 2:
                            System.out.println("2.\tDisplay list customers get voucher");

                            break;

                        case 3:

                            break;
                    }
                case 6:
                    System.out.println("exit");
                    break;
            }
        } while (login != 6);
    }
}