package com.sellit.repository;

import com.sellit.repository.entity.ProductEntity;
import com.sellit.services.IProductRepository;
import com.sellit.services.domain.ProductDomain;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImp implements IProductRepository {


    private final ProductRepository productRepository;

    public ProductRepositoryImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDomain salvarProduto(ProductDomain productDomain) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(productDomain.getName());
        productEntity.setPrice(productDomain.getPrice());
        productEntity.setDescription(productDomain.getDescription());
        productEntity.setQuantityInStock(productDomain.getQuantityInStock());
        productEntity.setActive(productDomain.isActive());

        ProductEntity productSaved = this.productRepository.save(productEntity);

        ProductDomain productDomainSaved = new ProductDomain();
        productDomainSaved.setId(productSaved.getId());
        productDomainSaved.setName(productSaved.getName());
        productDomainSaved.setPrice(productSaved.getPrice());
        productDomainSaved.setDescription(productSaved.getDescription());
        productDomainSaved.setQuantityInStock(productSaved.getQuantityInStock());
        productDomainSaved.setActive(productSaved.isActive());
        productDomainSaved.setCreatedAt(productSaved.getCreatedAt());
        productDomainSaved.setUpdatedAt(productSaved.getUpdatedAt());

        return productDomainSaved;
    }
}
