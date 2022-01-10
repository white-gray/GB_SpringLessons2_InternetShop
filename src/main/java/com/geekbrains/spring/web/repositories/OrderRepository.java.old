package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.entities.Orders;
import com.geekbrains.spring.web.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long>, JpaSpecificationExecutor<Orders> {

//    @Modifying
//    @Transactional
//    @Query("insert into orders (user_id, total_price, address, phone) value (:user_id, :total_price, :address, :phone);")
//    void updateOrders(Long user_id, Integer total_price, String address, String phone);

}
