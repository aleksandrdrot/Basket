package com.drot.basket.controller;

import com.drot.basket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("order")
public class BasketController {
    BasketService basket;

    public BasketController(BasketService basket) {
        this.basket = basket;
    }

    @GetMapping("/add")
    public void addBasket(@RequestParam int ... id) {
        basket.add(id);
    }

    @GetMapping("/get")
    public Set<Integer> getBasket(){
        return basket.get();
    }
}
