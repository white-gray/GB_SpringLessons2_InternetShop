package com.geekbrains.spring.web.core.repositories;

import com.geekbrains.spring.web.core.entities.Product;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Tag(name = "Работа с продуктами через БД", description = "Методы работы с продуктами в БД")
@Repository
public interface ProductsRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
