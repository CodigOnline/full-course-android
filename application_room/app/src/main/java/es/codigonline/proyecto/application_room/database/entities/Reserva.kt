package es.codigonline.proyecto.application_room.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.ForeignKey.SET_NULL
import androidx.room.Index
import java.util.Date

@Entity(
    tableName = "reservas",
    foreignKeys = [
        ForeignKey(
            entity = Cliente::class,
            parentColumns = ["id"],
            childColumns = ["cliente_id"],
            onUpdate = CASCADE,
            onDelete = SET_NULL
        )
    ],
    indices = [
        Index(value = ["cliente_id"])
    ]
)
data class Reserva(
    val fecha: Date,
    val precio: Double,
    @ColumnInfo(name = "cliente_id")
    val clienteId: Long?
) : BaseEntity()