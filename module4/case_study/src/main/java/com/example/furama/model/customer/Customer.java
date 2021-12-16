package com.example.furama.model.customer;


import com.example.furama.model.Contract.Contract;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.*;


@Entity
public class Customer implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType type_id;


    private String name;


    @DateTimeFormat
    private String dateOfBirt;

    private String gender;


    //    KH-XXXX (X là số từ 0-9)
    @NotBlank(message = "không được bỏ trống")
    private String idCard;



    @NotBlank(message = "không được bỏ trống")
    private String phoneNumber;


    @NotBlank(message = "không được bỏ trống")
    @Email(message = "nhập đúng format email")
    private String email;



    private String address;



    @OneToMany(targetEntity = Contract.class, mappedBy = "customer",cascade = CascadeType.REMOVE)
    private List<Contract> contractList;



    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerType getType_id() {
        return type_id;
    }

    public void setType_id(CustomerType type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirt() {
        return dateOfBirt;
    }

    public void setDateOfBirt(String dateOfBirt) {
        this.dateOfBirt = dateOfBirt;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;

        String idCard = customer.getIdCard();
        String phoneNumber = customer.getPhoneNumber();

        if (!idCard.matches("K[H][-]+[0-9]{9}")) {
            errors.rejectValue("idCard", "idCard.matches");
        }
        if (!phoneNumber.matches("[0]9+[0-9]{5,}")) {
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
//        if (!email.matches("([A-Za-z0-9]+@[.][a-z]{2,})")) {
//            errors.rejectValue("email", "email.matches");
//        }
    }
}
