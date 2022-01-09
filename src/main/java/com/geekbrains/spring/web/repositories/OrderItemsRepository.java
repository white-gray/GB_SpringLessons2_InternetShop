package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.entities.OrderItems;
import com.geekbrains.spring.web.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Long>, JpaSpecificationExecutor<OrderItems> {

    @Modifying
    @Transactional
    @Query("INSERT INTO ORDER_ITEMS VALUES (id, product_id, user_id, order_id, quantity, price_per_product, price);")
    void updateOrder_items(Long id, Long product_id, Long user_id,  Long order_id, Integer quantity, Integer price_per_product, Integer price);
}
