package com.geekbrains.spring.web.core.exceptions;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Ошибки корзины", description = "Методы работы с ошибками")
public class CartServiceIntegrationException extends RuntimeException {
    public CartServiceIntegrationException(String message) {
        super(message);
    }
}
