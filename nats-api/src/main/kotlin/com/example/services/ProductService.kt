package com.example.services

import com.example.dto.Product
import com.example.repositories.ProductRepository

class ProductService(
    private val productRepository: ProductRepository
) {

    fun create(product: Product): Product {
        return productRepository.save(product)
    }
}