package com.example.model

import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.EntityID
import java.util.*

class Product(id: EntityID<UUID>) : Entity<UUID>(id) {
    companion object : EntityClass<UUID, Product>(Products)

    var name by Products.name

}