package es.codigonline.proyecto.application_room.database.entities

import androidx.room.Entity
import androidx.room.Index

@Entity(tableName = "clientes", indices = [Index(value = ["email"], unique = true)])
data class Cliente(
    val nombre: String, val email: String, val password: String
) : BaseEntity()