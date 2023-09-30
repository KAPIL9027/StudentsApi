package com.example.learning.Student;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class StudentEntity {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private long studentId;
    private String studentName;
    private LocalDate dob;

    @Transient
    private int age;
    public int getAge() {
        return Period.between(dob,LocalDate.now()).getYears();
    }



    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dob=" + dob +
                '}';
    }
    public StudentEntity(){

    }
    public StudentEntity(long studentId, String studentName, LocalDate date) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = date;
    }
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

}
