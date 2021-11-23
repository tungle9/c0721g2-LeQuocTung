package com.example.bai_tap.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class Form implements Validator {
    private Integer id;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 45)
    private String firstName;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 45)
    private String lastName;


    private String sdt;

    @Min(18)
    @Max(100)
    private int age;


    private String email;


    public Form() {
    }

    public Form(@NotNull @NotBlank @Size(min = 5, max = 45) String firstName, @NotNull @NotBlank @Size(min = 5, max = 45) String lastName, String sdt, @Min(18) @Max(100) int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sdt = sdt;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Form form = (Form) target;

        String sdt = form.getSdt();
        String email = form.getEmail();
        ValidationUtils.rejectIfEmpty(errors, "sdt", "number.empty");

        if (!sdt.matches("([0-9]{4,})")) {
            errors.rejectValue("sdt", "number.matches");
        }

        if (!email.matches("([A-Za-z0-9]+@[.][a-z]{2,})")) {
            errors.rejectValue("email", "email.matches");
        }
    }
}
