package com.example.demo6.service;

import com.example.demo6.model.Student;

import java.util.List;

public interface studentService {

 List<Student> getAllStudents();
 void saveStudent(Student s);

}
