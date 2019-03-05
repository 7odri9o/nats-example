package com.example.controllers

import com.example.dto.CategoryDTO
import com.example.services.CategoryService
import io.javalin.Context
import org.eclipse.jetty.http.HttpStatus

class CategoryController(private val categoryService: CategoryService) {

    fun create(ctx: Context) {
        categoryService.create(ctx.bodyAsClass(CategoryDTO::class.java)).let {
            ctx.status(HttpStatus.CREATED_201)
            ctx.json(it)
        }
    }
}