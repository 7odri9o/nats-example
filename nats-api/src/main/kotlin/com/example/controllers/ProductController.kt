package com.example.controllers

import com.example.model.Product
import com.example.services.ProductService
import io.javalin.Context
import org.eclipse.jetty.http.HttpStatus

class ProductController(private val productService: ProductService) {

    fun create(ctx: Context) {
        val product = Product("Computador")
        ctx.status(HttpStatus.CREATED_201)
        ctx.json(product)
    }
}