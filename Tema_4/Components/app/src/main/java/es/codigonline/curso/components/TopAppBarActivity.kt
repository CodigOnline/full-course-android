package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.curso.components.databinding.ActivityTopAppBarBinding

class TopAppBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTopAppBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.topAppBar.setNavigationOnClickListener {
            Toast.makeText(this, "Cerrar", Toast.LENGTH_SHORT).show()
        }
        binding.topAppBar.setOnMenuItemClickListener {
            //switch
            when (it.itemId) {
                R.id.edit -> {
                    clickEdit()
                    true
                }
                R.id.favorite -> {
                    clickFav()
                    true
                }
                R.id.more -> {
                    clickMore()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun clickEdit() {
        Toast.makeText(this, "Editar", Toast.LENGTH_SHORT).show()
    }

    private fun clickFav() {
        Toast.makeText(this, "Favorito", Toast.LENGTH_SHORT).show()

    }

    private fun clickMore() {
        Toast.makeText(this, "Más opciones...", Toast.LENGTH_SHORT).show()

    }
}