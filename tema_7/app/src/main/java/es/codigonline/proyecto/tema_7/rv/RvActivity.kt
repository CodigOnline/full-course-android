package es.codigonline.proyecto.tema_7.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.*
import es.codigonline.proyecto.tema_7.R
import es.codigonline.proyecto.tema_7.databinding.ActivityRvBinding
import es.codigonline.proyecto.tema_7.listview.Persona

class RvActivity : AppCompatActivity(), AdapterRvFunctions {
    private lateinit var binding: ActivityRvBinding
    private val adapter = ItemRvAdapter().apply {
        listener = this@RvActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRvBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        val personas = mutableListOf(
            Persona(1, "Alvaro", "C/Falsa 1234"),
            Persona(2, "Cristian", "C/Falsa 4321"),
            Persona(3, "Carles", "C/Verdadera 1234"),
        )
        adapter.items = personas

        binding.fab.setOnClickListener {
            //CONECTAMOS CON EL VIEWMODEL
            //GUARDAMOS EN LA BASE DE DATOS
            //AÑADIMOS AL ADAPTADOR
            val persona = Persona(4, "Test", "adsfadgdsf")
            adapter.add(persona)

        }

        binding.rv.apply {
            adapter = this@RvActivity.adapter
            layoutManager = LinearLayoutManager(this@RvActivity, RecyclerView.VERTICAL, false)
            // layoutManager = StaggeredGridLayoutManager(2,RecyclerView.VERTICAL)
            // layoutManager = GridLayoutManager(this@RvActivity,2,RecyclerView.VERTICAL,false)
            addItemDecoration(DividerItemDecoration(this@RvActivity, RecyclerView.VERTICAL))
        }
    }

    override fun edit(persona: Persona) {

        //VIEWMODEL
        Toast.makeText(
            this,
            "Has clicado edit de ${persona.name}",
            Toast.LENGTH_SHORT
        )
            .show()
    }

    override fun delete(persona: Persona) {
        //VIEWMODEL
        Toast.makeText(
            this,
            "Has clicado delete de ${persona.name}",
            Toast.LENGTH_SHORT
        )
            .show()
    }
}