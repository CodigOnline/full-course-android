package es.codigonline.proyecto.tema_10.database.joins

import androidx.room.Embedded
import androidx.room.Relation
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota

/* 1 => N*/
data class AlumnoConNotas(
    @Embedded val alumno: Alumno,
    @Relation(
        parentColumn = "id",
        entityColumn = "alumno_id",
        entity = Nota::class
    )
    val notas: List<NotaConMateria>
)