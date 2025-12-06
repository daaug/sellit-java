package com.sellit.controller;

import com.sellit.services.domain.ProductDomain;
import com.sellit.controller.request.ProductRequest;
import com.sellit.controller.response.ProductResponse;
import com.sellit.services.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody ProductRequest productRequest) {

        ProductDomain productDomain = ProductDomain.builder()
                .id(null)
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .quantityInStock(productRequest.getQuantityInStock())
                .active(true)
                .build();

        this.productService.save(productDomain);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ProductResponse("Cadastrado"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable UUID id) {
        ProductResponse response = new ProductResponse("ProductDomain with ID: " + id + " would be retrieved here");
        return ResponseEntity.ok(response);
    }
}
