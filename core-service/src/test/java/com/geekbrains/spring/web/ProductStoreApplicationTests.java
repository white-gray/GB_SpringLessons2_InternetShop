package com.geekbrains.spring.web;

import com.geekbrains.spring.web.core.services.ProductsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductsService.class)
class ProductStoreApplicationTests {
	@Test
	void contextLoads() {
	}
}
