package com.example.services

import com.example.dto.CategoryDTO
import com.example.dto.CategoryResponse
import com.example.repositories.CategoryRepository

class CategoryService(
    private val categoryRepository: CategoryRepository
) {

    fun create(category: CategoryDTO): CategoryResponse {
        return categoryRepository.save(category).let {
            CategoryResponse(
                id = it.id.value.toString(),
                name = it.name,
                description = it.description
            )
        }
    }
}