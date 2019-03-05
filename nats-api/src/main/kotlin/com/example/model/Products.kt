package com.example.model

import org.jetbrains.exposed.dao.UUIDTable

internal object Products : UUIDTable() {

    val name = Products.varchar("name", 200)
}