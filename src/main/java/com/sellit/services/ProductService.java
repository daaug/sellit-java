package com.sellit.services;

import com.sellit.repository.entity.ProductEntity;
import com.sellit.services.domain.ProductDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String save(ProductDomain productDomain) {
        this.productRepository.salvarProduto(productDomain);
        return "Saved";
    }

    public Iterable<ProductEntity> getAllProducts() {
        return this.productRepository.getAllProducts();
    }

}
