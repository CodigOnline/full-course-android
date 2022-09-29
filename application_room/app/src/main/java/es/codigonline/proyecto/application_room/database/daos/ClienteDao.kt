package es.codigonline.proyecto.application_room.database.daos

import androidx.room.Dao
import es.codigonline.proyecto.application_room.database.entities.Cliente

@Dao
abstract class ClienteDao : BaseDao<Cliente>() {

}