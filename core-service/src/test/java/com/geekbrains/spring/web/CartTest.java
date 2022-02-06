package com.geekbrains.spring.web;


import com.geekbrains.spring.web.core.entities.Product;
import com.geekbrains.spring.web.core.services.CartService;
import com.geekbrains.spring.web.core.services.ProductsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest(classes = CartService.class)
public class CartTest {
    @Autowired
    private CartService cartService;

    @MockBean
    private ProductsService bookService;

    @BeforeEach
    public void initCart() {
        cartService.clearCart("test_cart");
    }

    @Test
    public void addToCartTest() {
        Product product = new Product();
        product.setId(5L);
        product.setTitle("X");
        product.setPrice(Integer.valueOf(100));

        Mockito.doReturn(Optional.of(product)).when(bookService).findById(5L);
        cartService.addToCart("test_cart", 5L);
        cartService.addToCart("test_cart", 5L);
        cartService.addToCart("test_cart", 5L);

        Mockito.verify(bookService, Mockito.times(1)).findById(ArgumentMatchers.eq(5L));
        Assertions.assertEquals(1, cartService.getCurrentCart("test_cart").getItems().size());
    }
}