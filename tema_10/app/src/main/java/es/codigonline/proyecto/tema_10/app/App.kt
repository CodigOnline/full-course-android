package es.codigonline.proyecto.tema_10.app

import android.app.Application
import es.codigonline.proyecto.tema_10.database.AppDatabase

class App : Application() {
    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.init(this)

    }
}