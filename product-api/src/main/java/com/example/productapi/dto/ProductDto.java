package com.example.productapi.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
