package es.codigonline.proyecto.tema_10.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import kotlinx.coroutines.flow.Flow

@Dao
interface AlumnoDao : BaseDao<Alumno> {
    @Query("SELECT * FROM alumnos")
    fun findAll(): Flow<List<Alumno>>

    @Query("SELECT * FROM alumnos WHERE id=:id")
    fun findAllById(id: Long): Alumno
}