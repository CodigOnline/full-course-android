package es.codigonline.proyecto.application_room.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.Index

@Entity(
    tableName = "reservas_extras",
    primaryKeys = ["reserva_id","extra_id"],
    indices = [
        Index(value = ["reserva_id"]),
        Index(value = ["extra_id"])
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
            entity = Extra::class,
            parentColumns = ["id"],
            childColumns = ["extra_id"],
            onUpdate = CASCADE,
            onDelete = CASCADE
        )
    ]
)
data class ReservaExtra(
    @ColumnInfo(name = "reserva_id")
    val reservaId: Long,
    @ColumnInfo(name = "extra_id")
    val extraId: Long
)
