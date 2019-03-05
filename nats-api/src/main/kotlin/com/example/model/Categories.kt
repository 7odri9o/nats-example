package com.example.model

import org.jetbrains.exposed.dao.UUIDTable

internal object Categories : UUIDTable() {

    val name = Categories.varchar("name", 200)
    val description = Categories.varchar("description", 200)
}