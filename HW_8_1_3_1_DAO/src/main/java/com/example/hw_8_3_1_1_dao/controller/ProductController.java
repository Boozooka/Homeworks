package com.example.hw_8_3_1_1_dao.controller;

import com.example.hw_8_3_1_1_dao.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/")
@Controller
public class ProductController {
    private ProductService service;


    public ProductController (ProductService service){
        this.service = service;
    }
    @GetMapping("/fetch-product")
    public List<String> getProductName (@RequestParam("name") String customerName){
        return service.getProductName(customerName);
    }
}
