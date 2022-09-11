package es.codigonline.proyecto.tema_7.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.*
import es.codigonline.proyecto.tema_7.R
import es.codigonline.proyecto.tema_7.databinding.ActivityRvBinding
import es.codigonline.proyecto.tema_7.listview.Persona

class RvActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRvBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.rv.apply {
            adapter = ItemRvAdapter().apply {
                items = mutableListOf<Persona>(
                    Persona(
                        "Alvaro",
                        "C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1C/1"
                    ),
                    Persona(
                        "Alvaro2",
                        "C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2C/2"
                    ),
                    Persona("Alvaro3", "C/3"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro4", "C/4"),
                    Persona("Alvaro5", "C/5")
                )
            }
            layoutManager = LinearLayoutManager(this@RvActivity, RecyclerView.VERTICAL, false)
            //layoutManager = StaggeredGridLayoutManager(2,RecyclerView.VERTICAL)
            // layoutManager = GridLayoutManager(this@RvActivity,2,RecyclerView.VERTICAL,false)
            addItemDecoration(DividerItemDecoration(this@RvActivity,RecyclerView.VERTICAL))
        }
    }
}