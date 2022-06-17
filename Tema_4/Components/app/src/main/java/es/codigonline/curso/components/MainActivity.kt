package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import es.codigonline.curso.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


/*        val textView = binding.tv1
        textView.text = "Hola Mundo!!!"*/

        binding.tv1.text = "Hola Mundo!!!"

    }
}