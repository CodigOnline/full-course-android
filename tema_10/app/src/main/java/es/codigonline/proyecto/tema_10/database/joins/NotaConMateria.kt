package es.codigonline.proyecto.tema_10.database.joins

import androidx.room.Embedded
import androidx.room.Relation
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota

/* 1 <=> 1*/
data class NotaConMateria(
    @Embedded val nota: Nota,
    @Relation(
        parentColumn = "materia_id",
        entityColumn = "id"
    )
    val materia: Materia
)
