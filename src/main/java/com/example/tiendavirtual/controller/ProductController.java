package com.example.tiendavirtual.controller;

import com.example.tiendavirtual.entity.ProductEntity;
import com.example.tiendavirtual.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public List<ProductEntity> getProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity product){
        return productRepository.save(product);
    }
}
