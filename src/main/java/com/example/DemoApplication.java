package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableTransactionManagement
public class DemoApplication {
    @RequestMapping("/")
    public String hah() {
        return "123123";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


