package com.example.learning.Student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(
                        1,
                        "Roman Reigns",
                        LocalDate.of(1997,5,23)),
                new Student(
                        2,
                        "Tom Reigns",
                        LocalDate.of(1997,5,23))
        );
    }
}
