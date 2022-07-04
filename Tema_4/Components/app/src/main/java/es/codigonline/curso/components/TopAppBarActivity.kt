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
        binding.topAppBar.setOnClickListener {
            Toast.makeText(this, "Cerrar", Toast.LENGTH_LONG).show()
        }

        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.edit -> {
                    Toast.makeText(this, "Edición", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.favorite -> {
                    Toast.makeText(this, "Favorito", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "más", Toast.LENGTH_LONG).show()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}