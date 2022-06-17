package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.servlet")
@SpringBootApplication
public class ExampleApp {
    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(ExampleApp.class).run(args);
    }
}
