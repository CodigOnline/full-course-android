package es.codigonline.proyecto.tema_10.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.joins.AlumnoConMaterias
import es.codigonline.proyecto.tema_10.database.joins.AlumnoConNotas
import kotlinx.coroutines.flow.Flow

@Dao
interface AlumnoDao : BaseDao<Alumno> {
    @Query("SELECT * FROM alumnos")
    fun findAll(): Flow<List<Alumno>>

    @Query("SELECT * FROM alumnos WHERE id=:id")
    fun findAllById(id: Long): Alumno

    @Transaction
    @Query("SELECT * FROM alumnos")
    fun findAllWithMaterias(): Flow<List<AlumnoConMaterias>>

    @Transaction
    @Query("SELECT * FROM alumnos")
    fun findAllWithNotas(): Flow<List<AlumnoConNotas>>
}