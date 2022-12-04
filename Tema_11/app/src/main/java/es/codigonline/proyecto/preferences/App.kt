package es.codigonline.proyecto.preferences

import android.app.Application
import android.content.SharedPreferences

class App : Application() {
    companion object {
        lateinit var preferences: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()
        preferences = getSharedPreferences(getString(R.string.prefs_name), MODE_PRIVATE)
    }

}