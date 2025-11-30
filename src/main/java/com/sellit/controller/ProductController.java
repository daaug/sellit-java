package com.sellit.controller;

import com.sellit.controller.request.ProductRequest;
import com.sellit.controller.response.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoque/produto")
public class ProductController {

    @PostMapping("/cadastrar")
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new ProductResponse("Produto cadastrado"));
    }
}
