package com.example.learning.Student;

import java.time.LocalDate;

public class Student {

    public Student(long studentId, String studentName, LocalDate dob) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
    }

    private long studentId;
    private String studentName;
    private LocalDate dob;

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
