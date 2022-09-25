package es.codigonline.proyecto.tema_10.database.entities

import androidx.room.Entity

@Entity(tableName = "alumnos")
data class Alumno(
    val nombre: String, val apellido: String, val edad: Int
) : BaseEntity()
