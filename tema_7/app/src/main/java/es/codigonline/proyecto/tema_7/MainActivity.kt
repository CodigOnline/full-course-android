package es.codigonline.proyecto.tema_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
            Persona("Alvaro","C/1"),
            Persona("Alvaro2","C/2"),
            Persona("Alvaro3","C/3"),
            Persona("Alvaro4","C/4"),
            Persona("Alvaro5","C/5")
        )

        val adapter = ItemAdapter(this,personas)

        binding.listView.adapter = adapter

    }


}