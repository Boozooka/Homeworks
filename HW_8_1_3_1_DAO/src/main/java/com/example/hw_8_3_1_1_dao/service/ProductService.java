package com.example.hw_8_3_1_1_dao.service;

import com.example.hw_8_3_1_1_dao.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService (ProductRepository repository){
        this.repository = repository;
    }

    public List<String> getProductName (String customerName){
        return repository.getProductName(customerName);
    }
}
