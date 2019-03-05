package com.example.config

import com.example.controllers.CategoryController
import com.example.controllers.ProductController
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.path
import io.javalin.apibuilder.ApiBuilder.post
import org.koin.standalone.KoinComponent

class Router(
    private val productController: ProductController,
    private val categoryController: CategoryController
) : KoinComponent {

    fun register(app: Javalin) {
        app.routes {
            path("products") {
                post(productController::create)
            }
            path("categories") {
                post(categoryController::create)
            }
        }
    }
}