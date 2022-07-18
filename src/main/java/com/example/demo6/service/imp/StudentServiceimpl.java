package com.example.demo6.service.imp;

import com.example.demo6.model.Student;
import com.example.demo6.repository.StudentRepository;
import com.example.demo6.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceimpl implements studentService {


    @Autowired
    private StudentRepository studentRepository;


   @Override
    public List<Student> getAllStudents(){

       return studentRepository.findAll();
   }
   @Override
   public void saveStudent(Student s){

         studentRepository.save(s);

   }
}
