package com.example.demo.repository;

import com.example.demo.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StockRepo extends JpaRepository<Stock, Integer> {



    @Query("SELECT s FROM Stock s WHERE s.symbol = :symbol")
    List<Stock> searchName(String symbol);



    @Query("SELECT s FROM Stock s WHERE s.price = :price")
    List<Double> getStockPrice(@Param("price") String symbol);



}
