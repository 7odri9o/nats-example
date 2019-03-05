package com.example.config

import com.example.controllers.ProductController
import com.example.repositories.ProductRepository
import com.example.services.ProductService
import org.koin.dsl.module.module

object ModulesConfig {

    private val configModule = module {
        single { ApplicationConfig() }
        single { Router(get()) }
    }

    private val productModule = module {
        single { ProductController(get()) }
        single { ProductService(get()) }
        single { ProductRepository() }
    }

    internal val allModules = listOf(
        ModulesConfig.configModule,
        ModulesConfig.productModule
    )
}