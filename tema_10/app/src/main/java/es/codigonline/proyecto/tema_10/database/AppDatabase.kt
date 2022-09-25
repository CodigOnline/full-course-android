package es.codigonline.proyecto.tema_10.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota

@Database(
    entities = [Alumno::class, Materia::class, Nota::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        private var db: AppDatabase? = null

        // private lateinit var db:AppDatabase
        fun init(ctx: Context): AppDatabase {
            if (db == null) {
                db = Room.databaseBuilder(ctx, AppDatabase::class.java, "bd").build()
            }

            return db!!

            /*
            if(!this::db.isInitialized){
                 db = //INICIALIZACION
             }
             return db
             */

        }
    }
}