package com.geekbrains.spring.web.dto;

import com.geekbrains.spring.web.entities.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
public class OrderDto {
    private Long id;
    private Long user_id;
    private Integer total_price;
    private String address;
    private String phone;

    public OrderDto(Cart cart) {
        this.id = id;
        this.user_id = user_id;
        this.total_price = total_price;
        this.address = address;
        this.phone = phone;
    }
}
