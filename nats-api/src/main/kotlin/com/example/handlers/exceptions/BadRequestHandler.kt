package com.example.handlers.exceptions

import com.example.dto.ErrorResponse
import io.javalin.BadRequestResponse
import io.javalin.Javalin
import org.eclipse.jetty.http.HttpStatus

object BadRequestHandler {

    fun register(app: Javalin) {
        app.exception(BadRequestResponse::class.java) { e, ctx ->
            val error = ErrorResponse(message = e.message)
            ctx.json(error).status(HttpStatus.BAD_REQUEST_400)
        }
    }
}