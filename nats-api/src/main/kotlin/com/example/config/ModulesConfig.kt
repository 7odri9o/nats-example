package com.example.config

import com.example.Router
import org.koin.dsl.module.module

object ModulesConfig {

    private val configModule = module {
        single { ApplicationConfig() }
        single { Router() }
    }

    internal val allModules = listOf(
        ModulesConfig.configModule
    )
}