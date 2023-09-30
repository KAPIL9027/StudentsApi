package com.example.learning.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository sr){

        return args -> {
            StudentEntity student1 = new StudentEntity(123232323,"Kapil",LocalDate.of(2002,Month.JANUARY,2));
            StudentEntity student2 = new StudentEntity(123344544,"Adam",LocalDate.of(2002,Month.JANUARY,25));

            sr.saveAll(List.of(student1,student2));

        };
    }
}
