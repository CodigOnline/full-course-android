package es.codigonline.proyecto.tema_10.database.joins

import androidx.room.Embedded
import androidx.room.Relation
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota

/* 1 => N */
data class MateriaConNotas(
    @Embedded val materia: Materia,
    @Relation(
        parentColumn = "id",
        entityColumn = "materia_id"
    )
    val notas: List<Nota>
)
