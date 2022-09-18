package es.codigonline.proyecto.tema_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        lifecycleScope.launch {
            val persona = with(Dispatchers.IO){
                //CONEXION A LA BD DONDE RECUPERAMOS LA PERSONA
            }
        }
    }
}