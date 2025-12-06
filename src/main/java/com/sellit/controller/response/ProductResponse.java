package com.sellit.controller.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Schema(description = "ProductDomain response")
public class ProductResponse {
    
    @Schema(description = "ProductDomain ID", example = "123e4567-e89b-12d3-a456-426614174000")
    private UUID id;
    
    @Schema(description = "ProductDomain name", example = "Notebook Dell")
    private String name;
    
    @Schema(description = "ProductDomain price", example = "2999.99")
    private BigDecimal price;
    
    @Schema(description = "ProductDomain description", example = "High performance notebook")
    private String description;
    
    @Schema(description = "Quantity in stock", example = "10")
    private Integer quantityInStock;
    
    @Schema(description = "Creation date", example = "2023-12-01T10:30:00")
    private LocalDateTime createdAt;
    
    @Schema(description = "Last update date", example = "2023-12-01T10:30:00")
    private LocalDateTime updatedAt;
    
    @Schema(description = "ProductDomain status", example = "true")
    private boolean active;
    
    @Schema(description = "Response message", example = "ProductDomain created successfully")
    private String message;
    
    public ProductResponse() {}
    
    public ProductResponse(String message) {
        this.message = message;
    }
    
    public ProductResponse(UUID id, String name, BigDecimal price, String description, 
                          Integer quantityInStock, LocalDateTime createdAt, 
                          LocalDateTime updatedAt, boolean active) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.active = active;
    }
    
    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public Integer getQuantityInStock() { return quantityInStock; }
    public void setQuantityInStock(Integer quantityInStock) { this.quantityInStock = quantityInStock; }
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
