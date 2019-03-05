package com.example.controllers

import com.example.dto.Product
import com.example.services.ProductService
import io.javalin.Context
import org.eclipse.jetty.http.HttpStatus

class ProductController(private val productService: ProductService) {

    fun create(ctx: Context) {
        productService.create(ctx.bodyAsClass(Product::class.java)).let {
            ctx.status(HttpStatus.CREATED_201)
            ctx.json(it)
        }
    }
}