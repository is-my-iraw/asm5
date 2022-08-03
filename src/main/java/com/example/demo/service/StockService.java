package com.example.demo.service;


import com.example.demo.entity.Stock;
import com.example.demo.repository.StockRepo;
import com.sun.org.apache.bcel.internal.generic.LUSHR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    StockRepo stockRepo;

    public List<Stock> getAll(){
        return stockRepo.findAll();
    }

    public List<Stock> getStockName(String symbol) {
        return stockRepo.searchName(symbol);
    }

    public List<Double> getStockPrice(String symbol) {
        return stockRepo.getStockPrice(symbol);
    }
}
