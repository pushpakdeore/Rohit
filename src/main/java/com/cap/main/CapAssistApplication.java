package com.cap.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.cap.main.security"}) // Scan only security package
public class CapAssistApplication {
    public static void main(String[] args) {
        SpringApplication.run(CapAssistApplication.class, args);
    }
}
