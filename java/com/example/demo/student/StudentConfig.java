package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jakhongir = new Student(
                    "Jakhongir",
                    "jahongirshuhratovich0995@gmail.com",
                    LocalDate.of(1995, JANUARY, 9)
            );

            Student jakhongir1 = new Student(
                    "Jakhongir1",
                    "jahongirshuhratovich1995@gmail.com",
                    LocalDate.of(1996, JANUARY, 19)
            );

            repository.saveAll(
                    List.of(jakhongir, jakhongir1)
            );
        };
    }
}
