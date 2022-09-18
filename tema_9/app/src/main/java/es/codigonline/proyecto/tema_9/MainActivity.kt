package es.codigonline.proyecto.tema_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val model: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        model.getData().observe(this){
            if (it){
                Log.d("SLEEP", "El resultado es TRUE")
            }else{
                Log.d("SLEEP", "El resultado es FALSE")
            }
        }

    }
}