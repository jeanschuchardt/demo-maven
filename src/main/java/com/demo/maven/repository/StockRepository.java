package com.demo.maven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.maven.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
