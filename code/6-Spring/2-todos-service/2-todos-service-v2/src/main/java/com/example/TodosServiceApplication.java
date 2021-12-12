package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
// or
@SpringBootApplication
public class TodosServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodosServiceApplication.class, args);
    }

}
