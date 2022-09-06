package com.loggin.demo.domain.Service;

import com.loggin.demo.domain.Entity.Basket;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BasketService {
    ResponseEntity<Basket> saveBasket(Basket basket);
    ResponseEntity<Basket> updateBasket(Long id,Basket basket);
    Optional<Basket> getBasketById(Long id);
    List<Basket> getAllBasket();

}
