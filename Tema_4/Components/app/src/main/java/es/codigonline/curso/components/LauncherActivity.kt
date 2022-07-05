package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        Log.d("APP", "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("APP", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("APP", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("APP", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("APP", "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("APP", "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("APP", "onDestroy()")
    }
}