package ru.sbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.sbt")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
