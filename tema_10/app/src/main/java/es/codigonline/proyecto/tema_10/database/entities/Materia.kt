package es.codigonline.proyecto.tema_10.database.entities

import androidx.room.Entity
import androidx.room.Index

@Entity(
    tableName = "materias",
    indices = [
        Index(value = ["nombre"], unique = true)
    ]
)
data class Materia(
    val nombre: String,
    val aula: String,
    val descripcion: String
) : BaseEntity()