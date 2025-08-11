package com.example.productapi.service;

import com.example.productapi.dto.CreateProductRequest;
import com.example.productapi.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;

public interface ProductService {
    ProductDto createProduct(CreateProductRequest request);
    ProductDto getProductById(Long id);
    Page<ProductDto> getAllProducts(Pageable pageable, String searchTerm, BigDecimal minPrice, BigDecimal maxPrice);
    ProductDto updateProduct(Long id, CreateProductRequest request);
    void deleteProduct(Long id);
}
