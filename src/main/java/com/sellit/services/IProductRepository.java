package com.sellit.services;

import com.sellit.repository.entity.ProductEntity;
import com.sellit.services.domain.ProductDomain;
import org.springframework.stereotype.Component;

@Component
public interface IProductRepository {
    ProductDomain salvarProduto(ProductDomain productDomain);
    Iterable<ProductEntity> getAllProducts();
}
