package com.example.furama.model.employee;


import com.example.furama.model.Contract.Contract;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Employee implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @NotEmpty
    private String name;


    @NotBlank
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private String birthday;


    private String idCard;


    private double salary;


    @NotNull
    private int phoneNumber;


    @Email(message = "pls enter right format")
    @NotBlank(message = "không được bỏ trống")
    private String email;


    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;


    @ManyToOne
    @JoinColumn(name = "education_id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User username;

    @OneToMany(targetEntity = Contract.class, mappedBy = "employee",cascade = CascadeType.REMOVE)
    private List<Contract> contractList;


    public Employee() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
//        Employee employee = (Employee) target;
//       int phoneNumber = employee.getPhoneNumber();
//
//       String phoneNumberString = String.valueOf(phoneNumber);
//
//
//       if(!phoneNumberString.matches("[0-9]{4,}")){
//           errors.rejectValue("phoneNumber","phoneNumber.matches");
//       }
    }
}
