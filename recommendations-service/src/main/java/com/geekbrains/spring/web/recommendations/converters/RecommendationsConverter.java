package com.geekbrains.spring.web.recommendations.converters;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecommendationsConverter {
    public RecommendationsDto modelToDto(Recommendations recommendations) {
        List<RecommendationsItemDto> recommendationsItemDtos = recommendations.getItems().stream().map(it ->
                new RecommendationsItemDto(it.getProductId(), it.getProductTitle(), it.getQuantity(), it.getPricePerProduct(), it.getPrice())
        ).collect(Collectors.toList());
        RecommendationsDto recommendationsDto = new RecommendationsDto(recommendationsItemDtos, recommendations.getTotalPrice());
        return recommendationsDto;
    }
}
