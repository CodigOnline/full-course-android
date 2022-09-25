package es.codigonline.proyecto.tema_10.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import es.codigonline.proyecto.tema_10.database.converts.DateConverter
import es.codigonline.proyecto.tema_10.database.daos.AlumnoDao
import es.codigonline.proyecto.tema_10.database.daos.MateriaDao
import es.codigonline.proyecto.tema_10.database.daos.NotaDao
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota

@Database(
    entities = [Alumno::class, Materia::class, Nota::class],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun alumnoDao(): AlumnoDao
    abstract fun materiaDao(): MateriaDao
    abstract fun notaDao(): NotaDao

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