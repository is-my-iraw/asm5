package com.example.demo.controller;


import com.example.demo.entity.Stock;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebController {


    @Autowired
    StockService service;

    @GetMapping("/index")
    public String index(Model model){
        List<Stock> list = service.getAll();
        model.addAttribute("stocks", list);
        return "index";
    }

    @GetMapping("/search")
    public String getStockName(Model model, @Param("symbol") String symbol){
        List<Stock> listStock = service.getStockName(symbol);
        model.addAttribute("search", listStock);
        return "index";
    }

}
