package com.geekbrains.spring.web.core.properties;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Tag(name = "Параметры WEB запросов")
@ConstructorBinding
@ConfigurationProperties(prefix = "integrations.cart-service.templates")
@Data
public class CartServiceIntegrationPropertiesTemplates {
    private Integer connection;
    private Integer read;
    private Integer write;


}
