package es.codigonline.proyecto.tema_10.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import es.codigonline.proyecto.tema_10.database.entities.Materia

@Dao
interface MateriaDao : BaseDao<Materia> {

    @Query("SELECT * FROM materias")
    fun findAll(): List<Materia>

    @Query("SELECT * FROM materias WHERE id=:id")
    fun findAllById(id: Long): Materia
}