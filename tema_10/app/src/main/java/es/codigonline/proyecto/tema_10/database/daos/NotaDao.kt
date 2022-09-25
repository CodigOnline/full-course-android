package es.codigonline.proyecto.tema_10.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import es.codigonline.proyecto.tema_10.database.entities.Nota

@Dao
interface NotaDao {
    @Insert //CREACION o INSERCION
    fun create(nota: Nota): Long

    @Update //ACTUALIZACION
    fun update(nota: Nota)

    @Delete //ELIMINACION
    fun delete(nota: Nota)

    @Query("SELECT * FROM notas")
    fun findAll(): List<Nota>

    @Query("SELECT * FROM notas WHERE alumno_id=:alumno and materia_id=:materia")
    fun findAllById(alumno: Long, materia: Long): Nota
}