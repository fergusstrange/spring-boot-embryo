package com.fergusstrange;

import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@EnableWebMvcSecurity
@SpringBootApplication
@ComponentScan("com.fergusstrange")
public class Application {
    public static void main(String... args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .listeners(new ApplicationPidFileWriter())
                .build()
                .run(args);
    }
}

