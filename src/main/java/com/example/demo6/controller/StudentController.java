package com.example.demo6.controller;

import com.example.demo6.model.Student;
import com.example.demo6.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    private final studentService stdservice;

    @Autowired
    public StudentController(studentService stdservice){
        this.stdservice = stdservice;
    }


    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }


    @RequestMapping(value = "/studentList",method = RequestMethod.GET)
    public ResponseEntity<List<Student>> studentList(){
        return new ResponseEntity<>(stdservice.getAllStudents(),HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public String saveStu(@RequestBody Student std){
        stdservice.saveStudent(std);
        return "Saved Data .......";
    }


    }

