package com.loggin.demo.domain.Service;

import com.loggin.demo.domain.Entity.Basket;
import com.loggin.demo.domain.Entity.Role;
import com.loggin.demo.infrastructure.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService{
    private final BasketRepository basketRepository;

    @Override
    public ResponseEntity<Basket> saveBasket(Basket basket) {

        return new ResponseEntity<>(basketRepository.save(basket), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Basket> updateBasket(Long id,Basket basket) {

        log.info("Update thanh cong");
        return ResponseEntity.ok(basketRepository.save(basket));
    }

    @Override
    public Optional<Basket> getBasketById(Long id) {
        return basketRepository.findById(id);
    }

    @Override
    public List<Basket> getAllBasket() {
        return basketRepository.findAll();
    }



}
