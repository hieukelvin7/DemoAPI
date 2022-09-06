package com.loggin.demo.infrastructure.repository;

import com.loggin.demo.domain.Entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long> {
}
