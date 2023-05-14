package com.drot.basket.service;

import com.drot.basket.Ibasket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class BasketService implements Ibasket {
    Set<Integer> basket = new HashSet<>();
    @Override
    public void add(int ... ID) {
        for(int s: ID){
            basket.add(s);
        }
    }

    @Override
    public Set<Integer> get() {
        return basket;
    }
}
