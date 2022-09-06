package com.loggin.demo.Interfaces.controller;

import com.loggin.demo.domain.Entity.Basket;
import com.loggin.demo.domain.Entity.User;
import com.loggin.demo.domain.Service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/basket")
public class BasketController {
    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Basket>> getAllBasket(){
        return ResponseEntity.ok().body(basketService.getAllBasket());
    }
    @PostMapping("/save")
    public ResponseEntity<Basket> saveBasket(@RequestBody Basket basket){
        //URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/basket/save").toUriString());
        return basketService.saveBasket(basket);
    }
    @PutMapping("/update/{basketId}")
    public ResponseEntity<Basket> updateBasket(@PathVariable("basketId") Long id,@RequestBody Basket basket){
        return basketService.updateBasket(id,basket);
    }
    @GetMapping("/{basketId}")
    public Optional<Basket> findBasketById(@PathVariable("basketId") Long id){
        return basketService.getBasketById(id);
    }
}
