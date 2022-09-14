package es.codigonline.proyecto.tema_7.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.codigonline.proyecto.tema_7.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        val personas = listOf<Persona>(
            Persona(    1,"Alvaro","C/1"),
            Persona(2,"Alvaro2","C/2"),
            Persona(3,"Alvaro3","C/3"),
            Persona(4,"Alvaro4","C/4"),
            Persona(5,"Alvaro5","C/5")
        )

        val adapter = ItemAdapter(this,personas)

        binding.listView.adapter = adapter

    }


}