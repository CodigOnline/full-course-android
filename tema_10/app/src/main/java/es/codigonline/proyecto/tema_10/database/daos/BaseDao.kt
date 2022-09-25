package es.codigonline.proyecto.tema_10.database.daos

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import es.codigonline.proyecto.tema_10.database.entities.Alumno

interface BaseDao<T> {
    @Insert //CREACION o INSERCION
    fun create(t: T): Long

    @Update //ACTUALIZACION
    fun update(t: T)

    @Delete //ELIMINACION
    fun delete(t: T)
}