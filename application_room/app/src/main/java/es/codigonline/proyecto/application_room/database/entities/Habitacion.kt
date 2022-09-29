package es.codigonline.proyecto.application_room.database.entities

import androidx.room.Entity
import androidx.room.Index
import java.util.Date

@Entity(tableName = "habitaciones", indices = [Index(value = ["numero"], unique = true)])
data class Habitacion(
    val numero: Int,
    val capacidad: Int,
) : BaseEntity()