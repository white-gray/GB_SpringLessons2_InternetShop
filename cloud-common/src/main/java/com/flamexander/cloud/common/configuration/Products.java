package com.flamexander.cloud.common.configuration;

import com.flamexander.cloud.common.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
//@EnableEurekaClient
@RestController
public class Products {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    public static void main(String[] args) {
//        SpringApplication.run(Products.class, args);
//    }

    @GetMapping("/api/v1/common")
    public String getGreetings() {
        return "Hello my friend!!!";
    }

    @GetMapping("/api/v1/common/prod")
    public List<ProductDto> getSlowGreetings() {
//        String data = restTemplate.getForObject("http://slow-service/api/v1/slow?delay={delay}", String.class, "3");
//        String data = restTemplate.getForObject("http://localhost:63641/api/v1/slow", String.class);
        List<ProductDto> data = restTemplate.getForObject("http://product-service/api/v1/products", List.class);
//        List<ProductDto> data = restTemplate.getForObject("http://localhost:12345/api/v1/products", List.class);
        return data;
    }
}
