package com.example.repositories

import com.example.dto.ProductDTO
import com.example.model.Product
import org.jetbrains.exposed.sql.transactions.transaction

class ProductRepository {

    fun save(product: ProductDTO): Product {

        return transaction {
            Product.new {
                name = product.name.toString()
                price = product.price!!.toBigDecimal()
            }
        }
    }

}