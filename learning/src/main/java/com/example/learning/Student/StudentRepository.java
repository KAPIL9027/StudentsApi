package com.example.learning.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    @Query("Select s from StudentEntity s where s.studentName = ?1")
    Optional<StudentEntity> findStudentEntityByName(String name);


}


