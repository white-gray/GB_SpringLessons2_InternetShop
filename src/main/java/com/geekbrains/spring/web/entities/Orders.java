package com.geekbrains.spring.web.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "total_price")
    private Integer total_price;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;
}
