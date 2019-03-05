package com.example.handlers

import com.example.dto.ProductDTO
import io.javalin.BadRequestResponse
import io.javalin.Javalin

object ProductDTOValidator {

    fun register(app: Javalin) {
        app.before("/products") {
            it.method().takeIf { method -> method == "POST" }
                .apply {
                    val body = it.body<ProductDTO>()
                    body.let { productDTO ->
                        if (productDTO.name.isNullOrBlank()) {
                            throw BadRequestResponse("O campo Name deve ser preenchido")
                        }
                        if (productDTO.price == null) {
                            throw BadRequestResponse("O campo Price deve ser preenchido")
                        }
                        if (productDTO.price == 0.toFloat()) {
                            throw BadRequestResponse("O campo Price deve conter um valor diferente de 0")
                        }
                    }
                }
        }
    }
}