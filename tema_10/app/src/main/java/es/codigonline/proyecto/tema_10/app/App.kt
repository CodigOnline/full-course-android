package es.codigonline.proyecto.tema_10.app

import android.app.Application
import es.codigonline.proyecto.tema_10.database.AppDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class App : Application() {
    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.init(this, CoroutineScope(Dispatchers.IO))

    }
}