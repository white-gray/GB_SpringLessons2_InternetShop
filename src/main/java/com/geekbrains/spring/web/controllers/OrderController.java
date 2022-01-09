package com.geekbrains.spring.web.controllers;

import com.geekbrains.spring.web.dto.Cart;
import com.geekbrains.spring.web.services.CartService;
import com.geekbrains.spring.web.services.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrdersService orderService;
    private final CartService cartService;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestParam String phone,
                                         @RequestParam String address,
                                         Principal principal) {
          return orderService.createOrder(phone, address, principal);
    }
}
