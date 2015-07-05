package com.fergusstrange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fergusstrange")
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }
}