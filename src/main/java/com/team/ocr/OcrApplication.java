package com.team.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OcrApplication {

    public static void main(String[] args) {
        System.out.println("Test1");
        SpringApplication.run(OcrApplication.class, args);
        System.out.println("Test2");
    }

}
