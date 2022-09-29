package es.codigonline.proyecto.application_room.database.entities

import androidx.room.Entity
import androidx.room.Index
import java.util.Date

@Entity(tableName = "extras", indices = [Index(value = ["nombre"], unique = true)])
data class Extra(
    val nombre: String,
    val descripcion: String,
) : BaseEntity()