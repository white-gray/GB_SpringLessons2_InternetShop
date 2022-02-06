package com.geekbrains.spring.web;

import com.geekbrains.spring.web.core.SpringWebApplication;
import com.geekbrains.spring.web.core.entities.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = SpringWebApplication.class)
@ActiveProfiles("test")
public class FullServerRunTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void fullRestTest() {
        // Spring page class ...
        List<Product> products = restTemplate.getForObject("/api/v1/products", List.class);
        assertThat(products).isNotNull();
        assertThat(products).isNotEmpty();
    }
}
