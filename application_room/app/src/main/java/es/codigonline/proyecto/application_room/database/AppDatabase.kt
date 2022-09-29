package es.codigonline.proyecto.application_room.database

import android.content.Context
import android.telecom.Call
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import es.codigonline.proyecto.application_room.database.converters.DateConverter
import es.codigonline.proyecto.application_room.database.entities.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Database(
    entities = [Cliente::class, Extra::class, Habitacion::class, Reserva::class, ReservaExtra::class, ReservaHabitacion::class],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        private var db: AppDatabase? = null
        private fun iniciarBD(coroutineScope: CoroutineScope): Callback {
            return object : Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    coroutineScope.launch {
                        /*TODO IMPLEMENTAR INICIO DE LA BD */
                    }
                }
            }

        }

        fun init(context: Context, coroutineScope: CoroutineScope): AppDatabase {
            if (db == null) {
                db = Room.databaseBuilder(context, AppDatabase::class.java, "hotel")
                    .addCallback(iniciarBD(coroutineScope))
                    .build()
            }
            return db!!
        }
    }
}