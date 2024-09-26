package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages = "com.example.library") 
@EntityScan(basePackages = "com.example.library") 
public class LibraryApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApiApplication.class, args);
    }
}

