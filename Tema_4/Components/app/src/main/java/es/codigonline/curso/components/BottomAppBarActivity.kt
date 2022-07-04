package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.curso.components.databinding.ActivityBottomAppBarBinding

class BottomAppBarActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBottomAppBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBottomAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            Toast.makeText(this, "Calendario", Toast.LENGTH_SHORT).show()

        }
        binding.bottomAppBar.setNavigationOnClickListener {
            Toast.makeText(this, "Cerrar", Toast.LENGTH_SHORT).show()

        }
        binding.bottomAppBar.setOnMenuItemClickListener {
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