package com.example.learning.Student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
        Optional<StudentEntity> optionalStudent = sr.findStudentEntityByName(se.getStudentName());
        if(optionalStudent.isPresent()){
            throw new IllegalStateException("Student already exists");
        }

        sr.save(se);
    }

    public void deleteStudentById(long id){
        boolean exists = sr.existsById(id);
        if(!exists){
            throw new IllegalStateException("Student does not exist");
        }

        sr.deleteById(id);
    }


    @Transactional
    public void updateStudentById(long id,String name){
        Optional<StudentEntity> se  = sr.findById(id);

        if(se.isEmpty()){

            throw new IllegalStateException("Student does not exist");
        }
        String studentName = se.get().getStudentName();
        if(name != null && name.length() > 0 && !studentName.equals(name)){
            se.get().setStudentName(name);
        }



    }
}
