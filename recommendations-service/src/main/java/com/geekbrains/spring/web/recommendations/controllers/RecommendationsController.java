package com.geekbrains.spring.web.recommendations.controllers;

import com.geekbrains.spring.web.api.core.ProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class RecommendationsController {
    private Map<ProductDto, Integer> foldedToCartPerDay = new HashMap<>();
    private Map<ProductDto, Integer> buyedForMounth = new HashMap<>();

    @GetMapping("/putInCart/{name}")
    public void putInCart(@PathVariable ProductDto productDto) {
        foldedToCartPerDay.put(productDto, foldedToCartPerDay.get(productDto)+1);
log.info("foldedToCartPerDay = " + foldedToCartPerDay.toString());
    }

    @GetMapping("/buyedForMounth/{name}")
    public void buyedForMounth(@PathVariable ProductDto productDto) {
        buyedForMounth.put(productDto, buyedForMounth.get(productDto)+1);
log.info("buyedForMounth = " + buyedForMounth.toString());
    }

    @GetMapping("/maxhitcart5")
    public Object maxHitCart() {
        SortedMap hitCart = (SortedMap) new HashMap<Integer,ProductDto>();
        for (ProductDto key:foldedToCartPerDay.keySet()) {
            hitCart.put(foldedToCartPerDay.get(key), key);
        }
        int w=0;
        for (Object key:hitCart.keySet()) {
            if (w >=5) break;
            return hitCart.get(key);
        }
        return null;
    }

    @GetMapping("/maxbuyed5")
    public Object maxBuyed() {
        SortedMap maxBuyed = (SortedMap) new HashMap<Integer,ProductDto>();
        for (ProductDto key:buyedForMounth.keySet()) {
            maxBuyed.put(buyedForMounth.get(key), key);
        }
        int w=0;
        for (Object key:maxBuyed.keySet()) {
            if (w >=5) break;
            return maxBuyed.get(key);
        }
        return null;
    }

}
