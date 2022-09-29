package es.codigonline.proyecto.application_room.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.Index

@Entity(
    tableName = "reservas_habitaciones",
    primaryKeys = ["reserva_id","habitacion_id"],
    indices = [
        Index(value = ["reserva_id"]),
        Index(value = ["habitacion_id"])
    ],
    foreignKeys = [
        ForeignKey(
            entity = Reserva::class,
            parentColumns = ["id"],
            childColumns = ["reserva_id"],
            onUpdate = CASCADE,
            onDelete = CASCADE
        ),
        ForeignKey(
            entity = Habitacion::class,
            parentColumns = ["id"],
            childColumns = ["habitacion_id"],
            onUpdate = CASCADE,
            onDelete = CASCADE
        )
    ]
)
data class ReservaHabitacion(
    @ColumnInfo(name = "reserva_id")
    val reservaId: Long,
    @ColumnInfo(name = "habitacion_id")
    val habitacionId: Long
)
