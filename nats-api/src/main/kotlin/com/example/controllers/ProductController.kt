package com.example.controllers

import com.example.dto.ProductDTO
import com.example.services.ProductService
import io.javalin.Context
import org.eclipse.jetty.http.HttpStatus

class ProductController(private val productService: ProductService) {

    fun create(ctx: Context) {
        productService.create(ctx.bodyAsClass(ProductDTO::class.java)).let {
            ctx.status(HttpStatus.CREATED_201)
            ctx.json(it)
        }
    }
}