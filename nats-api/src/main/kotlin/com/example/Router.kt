package com.example

import com.example.controllers.ProductController
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.path
import io.javalin.apibuilder.ApiBuilder.post
import org.koin.standalone.KoinComponent

class Router(
    private val productController: ProductController
) : KoinComponent {

    fun register(app: Javalin) {
        app.routes {
            path("products") {
                post(productController::create)
            }
        }
    }
}