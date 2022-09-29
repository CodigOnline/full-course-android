package es.codigonline.proyecto.application_room.database.daos

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import es.codigonline.proyecto.application_room.database.entities.BaseEntity
import java.util.*

abstract class BaseDao<T> where T : BaseEntity {

    @Insert
    abstract fun save(t: T): Long

    @Delete
    abstract fun delete(t: T)

    @Update
    protected abstract fun updatePrivate(t: T)

    fun update(t: T) {
        t.updateAt = Date(System.currentTimeMillis())
        updatePrivate(t)
    }


}