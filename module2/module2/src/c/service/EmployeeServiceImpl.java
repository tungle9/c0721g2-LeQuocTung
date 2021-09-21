package c.service;

import c.dichvu.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    private static List<Employee> list = new ArrayList<>();
    static {
        list.add(new Employee("Thảo",1998,"nữ",123,0712121,"thao@123",
                123123,Employee.DAIHOC,123123123));
    }
}
