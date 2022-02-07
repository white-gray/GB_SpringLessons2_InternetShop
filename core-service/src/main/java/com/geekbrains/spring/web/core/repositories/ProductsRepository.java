package com.geekbrains.spring.web.core.repositories;

import com.geekbrains.spring.web.core.entities.Order;
import com.geekbrains.spring.web.core.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    @Query("SELECT p FROM Product p ORDER BY p.buyedForMounth LIMIT 5")
    List<Product> findBuyedForMounth();

    @Query("SELECT p FROM Product p ORDER BY p.foldedToCartPerDay LIMIT 5")
    List<Product> findFoldedToCartPerDay();
}
