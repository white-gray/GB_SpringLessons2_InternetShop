package com.geekbrains.spring.web.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Long product_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "order_id")
    private Long order_id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price_per_product")
    private Integer price_per_product;

    @Column(name = "price")
    private Integer price;
}
