package com.calzadosport.calzado_sport_app.services;

import java.util.List;
import java.util.Optional;

import com.calzadosport.calzado_sport_app.entities.Product;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product saveProduct(Product product);
    void deleteProduct(Product product);
}
