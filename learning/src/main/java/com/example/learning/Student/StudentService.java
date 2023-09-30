package com.example.learning.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public StudentService(StudentRepository sr) {
        this.sr = sr;
    }

    @Autowired
    private StudentRepository sr;
    public List<StudentEntity> getStudents(){
        List<StudentEntity> st = sr.findAll();

        return st;
    }

    public void addNewStudent(StudentEntity se) {
        System.out.println(se);
        sr.save(se);
    }
}
