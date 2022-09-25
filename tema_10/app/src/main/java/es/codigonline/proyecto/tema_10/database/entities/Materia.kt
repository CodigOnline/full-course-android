package es.codigonline.proyecto.tema_10.database.entities

import androidx.room.Entity
@Entity(tableName = "materias")
data class Materia(
    val nombre: String,
    val aula: String,
    val descripcion: String
) : BaseEntity()