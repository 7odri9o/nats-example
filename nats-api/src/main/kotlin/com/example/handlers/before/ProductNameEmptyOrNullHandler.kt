package com.example.handlers

import com.example.dto.ProductDTO
import io.javalin.BadRequestResponse
import io.javalin.Javalin

object ProductNameEmptyOrNullHandler {

    fun register(app: Javalin) {
        app.before("/products") {
            it.method().takeIf { method -> method == "POST" }
                .apply {
                    val product = it.body<ProductDTO>()
                    product.name.let { name ->
                        if (name.isNullOrBlank()) {
                            throw BadRequestResponse("O campo Name deve ser preenchido")
                        }
                    }
                }
        }
    }
}