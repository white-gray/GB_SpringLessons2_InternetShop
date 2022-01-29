package com.flamexander.cloud.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
public class CommonApp {
    public static void main(String[] args) {
        SpringApplication.run(CommonApp.class, args);
    }
}
