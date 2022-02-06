package com.geekbrains.spring.web;

import com.geekbrains.spring.web.core.entities.Product;
import com.geekbrains.spring.web.core.repositories.ProductsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@DataJpaTest
@ActiveProfiles("test")
public class RepositoriesTest {
    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void genreRepositoryTest() {
        Product product = new Product();
        product.setTitle("Fiction");
        entityManager.persist(product);
        entityManager.flush();

        List<Product> genresList = productsRepository.findAll();

        Assertions.assertEquals(2, genresList.size());
        Assertions.assertEquals("Fiction", genresList.get(1).getTitle());
    }

    @Test
    public void initDbTest() {
        List<Product> genresList = productsRepository.findAll();
        Assertions.assertEquals(1, genresList.size());
    }
}
