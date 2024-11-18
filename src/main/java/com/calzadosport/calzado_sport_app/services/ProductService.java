package com.calzadosport.calzado_sport_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.calzadosport.calzado_sport_app.entities.Product;
import com.calzadosport.calzado_sport_app.repositories.ProductRepository;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly=true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Transactional(readOnly=true)
    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Transactional
    @Override
    public Optional<Product> deleteProduct(Product product) {
        Optional<Product> productOptional = repository.findById(product.getId());
        productOptional.ifPresent(productDb -> {
            repository.delete(productDb);
        });
        return productOptional;
    }
 
}
