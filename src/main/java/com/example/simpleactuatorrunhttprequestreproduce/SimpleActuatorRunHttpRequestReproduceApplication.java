package com.example.simpleactuatorrunhttprequestreproduce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleActuatorRunHttpRequestReproduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleActuatorRunHttpRequestReproduceApplication.class, args);
    }

    @GetMapping("/find-all")
    String findAll() {
        return "All!";
    }
}
