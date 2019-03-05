package com.example.handlers

import com.example.handlers.exceptions.BadRequestHandler
import io.javalin.Javalin
import org.koin.standalone.KoinComponent

object RegisterHandlers : KoinComponent {

    fun register(app: Javalin) {
        ProductNameEmptyOrNullHandler.register(app)

        BadRequestHandler.register(app)
    }
}