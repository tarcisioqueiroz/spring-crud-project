package com.crudprodutos.crud.controller;

import com.crudprodutos.crud.model.Product;
import com.crudprodutos.crud.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Product> list(){
        return repository.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return repository.save(product);
    }
}
