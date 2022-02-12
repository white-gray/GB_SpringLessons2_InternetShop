package com.geekbrains.spring.web.core.integrations;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.core.entities.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductsServiceIntegration {
    private final RestTemplate restTemplate;

    @Value("${integrations.recommendations-service.url}")
    private String recommendationsUrl;

    public void buyedForMounth(Product product) {
        restTemplate.getForObject(recommendationsUrl + "/api/v1/recommendations/buyedForMounth/"+product, String.class);
    }


}
