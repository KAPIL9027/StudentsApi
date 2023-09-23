package com.example.learning.Student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/api/student")
public class StudentController
{
    private  StudentService ss;
    public StudentController() {
        ss = new StudentService();
    }
    public StudentService getStudentService(){
        return ss;
    }
    @GetMapping
    public List<Student> getStudents(){
        return ss.getStudents();
    }
}
