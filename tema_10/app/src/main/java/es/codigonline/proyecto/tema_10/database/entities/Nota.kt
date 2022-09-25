package es.codigonline.proyecto.tema_10.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import java.util.*

@Entity(
    tableName = "notas",
    primaryKeys = ["alumno_id", "materia_id"],
    foreignKeys = [
        ForeignKey(
            entity = Alumno::class,
            parentColumns = ["id"],
            childColumns = ["alumno_id"],
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Materia::class,
            parentColumns = ["id"],
            childColumns = ["materia_id"],
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["alumno_id"]),
        Index(value = ["materia_id"])
    ]
)
data class Nota(
    @ColumnInfo(name = "alumno_id") val alumnoId: Long,
    @ColumnInfo(name = "materia_id") val materiaId: Long,
    val nota: Double
){
/*    @ColumnInfo(name = "create_at")
    var createAt = Date(System.currentTimeMillis())
    @ColumnInfo(name = "update_at")
    var updateAt = Date(System.currentTimeMillis())*/
}