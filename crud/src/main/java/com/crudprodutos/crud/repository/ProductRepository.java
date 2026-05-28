package com.crudprodutos.crud.repository;

import com.crudprodutos.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}