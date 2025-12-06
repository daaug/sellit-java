package com.sellit.controller.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Schema(description = "ProductDomain creation request")
public class ProductRequest {
    
    @NotBlank(message = "Name cannot be blank")
    @Schema(description = "ProductDomain name", example = "Notebook Dell", required = true)
    private String name;
    
    @NotNull(message = "Price cannot be null")
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    @Schema(description = "ProductDomain price", example = "2999.99", required = true)
    private BigDecimal price;
    
    @Schema(description = "ProductDomain description", example = "High performance notebook")
    private String description;
    
    @Schema(description = "Quantity in stock", example = "10")
    private Integer quantityInStock;
    
    public ProductRequest() {}
    
    public ProductRequest(String name, BigDecimal price, String description, Integer quantityInStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public Integer getQuantityInStock() { return quantityInStock; }
    public void setQuantityInStock(Integer quantityInStock) { this.quantityInStock = quantityInStock; }
}
