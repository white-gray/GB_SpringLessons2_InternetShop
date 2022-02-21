package com.geekbrains.spring.web.core.exceptions;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Ошибки", description = "Методы работы с ошибками")
@Data
public class ValidationException extends RuntimeException {
    private List<String> errorFieldsMessages;

    public ValidationException(List<String> errorFieldsMessages) {
        super(errorFieldsMessages.stream().collect(Collectors.joining(", ")));
        this.errorFieldsMessages = errorFieldsMessages;
    }
}
