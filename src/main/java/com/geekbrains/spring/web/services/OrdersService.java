package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.dto.Cart;
import com.geekbrains.spring.web.dto.OrderDto;
import com.geekbrains.spring.web.dto.OrderItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.Principal;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private final ProductsService productsService;
    private Cart cart;
    private OrderItemDto orderItemDto;
    private OrdersService ordersService;
    private OrderDto orderDto;

//    @PostConstruct
//    public void init() {
//        order = new OrderItemDto();
//    }

    public Cart getCurrentCart() {
        return cart;
    }



    public ResponseEntity<?> createOrder(String phone, String address, Principal principal) {
//        if (principal == null) {
//            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        }
        for (OrderItemDto items : cart.getItems()) {
 System.out.println("items = " + items);
        }
//        SpringDataJaxb.OrderDto orderDto = orderService.createOrder(phone, address, principal);
        return new ResponseEntity<>(orderDto, HttpStatus.CREATED);
    }
}
