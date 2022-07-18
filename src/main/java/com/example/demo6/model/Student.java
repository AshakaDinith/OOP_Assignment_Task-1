package com.example.demo6.model;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Student Number is mandatory")
    private String studentNumber;

    @NotBlank(message = "Name is mandatory")
    private String studentName;

    private String city;

    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email cannot be empty")
    private String email;



    public Student(String studentNumber, String studentName, String city,String email) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.city = city;
        this.email = email;
    }

    public Student() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
