package com.example.handlers

import com.example.dto.CategoryDTO
import io.javalin.BadRequestResponse
import io.javalin.Javalin

object CategoryDTOValidator {

    fun register(app: Javalin) {
        app.before("/categories") {
            it.method().takeIf { method -> method == "POST" }
                .apply {
                    val body = it.body<CategoryDTO>()
                    body.let { categoryDTO ->
                        if (categoryDTO.name.isNullOrBlank()) {
                            throw BadRequestResponse("O campo Name deve ser preenchido")
                        }
                        if (categoryDTO.description.isNullOrBlank()) {
                            throw BadRequestResponse("O campo Description deve ser preenchido")
                        }
                    }
                }
        }
    }
}