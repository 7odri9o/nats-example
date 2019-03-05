package com.example.config

import com.example.controllers.CategoryController
import com.example.controllers.ProductController
import com.example.repositories.CategoryRepository
import com.example.repositories.ProductRepository
import com.example.services.CategoryService
import com.example.services.ProductService
import org.koin.dsl.module.module

object ModulesConfig {

    private val configModule = module {
        single { ApplicationConfig() }
        single { Router(get(), get()) }
    }

    private val productModule = module {
        single { ProductController(get()) }
        single { ProductService(get()) }
        single { ProductRepository() }
    }

    private val categoryModule = module {
        single { CategoryController(get()) }
        single { CategoryService(get()) }
        single { CategoryRepository() }
    }

    internal val allModules = listOf(
        ModulesConfig.configModule,
        ModulesConfig.productModule,
        ModulesConfig.categoryModule
    )
}