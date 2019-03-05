package com.example.repositories

import com.example.dto.CategoryDTO
import com.example.model.Category
import org.jetbrains.exposed.sql.transactions.transaction

class CategoryRepository {

    fun save(category: CategoryDTO): Category {

        return transaction {
            Category.new {
                name = category.name.toString()
                description = category.description.toString()
            }
        }
    }
}