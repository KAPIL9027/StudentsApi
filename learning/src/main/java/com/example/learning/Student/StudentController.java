package com.example.learning.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1/student")
public class StudentController
{

    @Autowired
    private  StudentService ss;
    public StudentController(StudentService s1) {
        this.ss = s1;
    }
    public StudentService getStudentService(){
        return ss;
    }


    @GetMapping
    public List<StudentEntity> getStudents(){

        List<StudentEntity> list = ss.getStudents();
        System.out.println(list);
        return list;
    }

    @PostMapping
    public void addNewStudent(@RequestBody StudentEntity se){
        ss.addNewStudent(se);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudentById(@PathVariable("studentId") Long id){
        ss.deleteStudentById(id);
    }

    @PutMapping(path="{studentId}")
    public void updateStudentById(@PathVariable("studentId") Long id, @RequestParam(required = false) String studentName){
        ss.updateStudentById(id,studentName);
    }
}
