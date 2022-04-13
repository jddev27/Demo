package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student juan = new Student(
                "Juan",
                "jddev@gmail.com",
                LocalDate.of(1988, Month.FEBRUARY, 5)
            );
            Student genesis = new Student(

                    "Genesis",
                    "gen@gmail.com",
                    LocalDate.of(1990, Month.FEBRUARY, 5)
            );

            repository.saveAll(
                    List.of(juan, genesis)
            );
        };
    }
}
