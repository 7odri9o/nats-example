package com.example.services

import com.example.dto.ProductDTO
import com.example.dto.ProductResponse
import com.example.repositories.ProductRepository

class ProductService(
    private val productRepository: ProductRepository
) {

    fun create(product: ProductDTO): ProductResponse {
        return productRepository.save(product).let {
            ProductResponse(
                id = it.id.value.toString(),
                name = it.name
            )
        }
    }
}