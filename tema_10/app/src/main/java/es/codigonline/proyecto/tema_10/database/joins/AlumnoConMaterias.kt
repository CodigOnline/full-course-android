package es.codigonline.proyecto.tema_10.database.joins

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota

data class AlumnoConMaterias(
    @Embedded val alumno: Alumno,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            value = Nota::class,
            parentColumn = "alumno_id",
            entityColumn = "materia_id"
        )
    )
    val materia: List<Materia>
)
