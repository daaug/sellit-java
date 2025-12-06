package com.sellit.services;

import com.sellit.services.domain.ProductDomain;
import org.springframework.stereotype.Component;

@Component
public interface IProductRepository {
    ProductDomain salvarProduto(ProductDomain productDomain);
}
