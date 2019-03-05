package com.example.model

import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.EntityID
import java.util.*

class Category(id: EntityID<UUID>) : Entity<UUID>(id) {
    companion object : EntityClass<UUID, Category>(Categories)

    var name by Categories.name
    var description by Categories.description
}