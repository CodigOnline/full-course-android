package es.codigonline.proyecto.tema_10.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import es.codigonline.proyecto.tema_10.app.App
import es.codigonline.proyecto.tema_10.database.converts.DateConverter
import es.codigonline.proyecto.tema_10.database.daos.AlumnoDao
import es.codigonline.proyecto.tema_10.database.daos.MateriaDao
import es.codigonline.proyecto.tema_10.database.daos.NotaDao
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota
import kotlinx.coroutines.*

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
        private fun rellenarBD(coroutine: CoroutineScope): Callback {
            return object : Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    coroutine.launch {
                        App.db.materiaDao().create(Materia("M01", "201", "Programacion 1"))
                        App.db.materiaDao().create(Materia("M02", "202", "Programacion 2"))
                        App.db.materiaDao().create(Materia("M03", "203", "Programacion 3"))
                    }
                }
            }
        }

        // private lateinit var db:AppDatabase
        fun init(ctx: Context, coroutine: CoroutineScope): AppDatabase {
            if (db == null) {
                db = Room.databaseBuilder(ctx, AppDatabase::class.java, "bd")
                    .addCallback(rellenarBD(coroutine))
                    .build()
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