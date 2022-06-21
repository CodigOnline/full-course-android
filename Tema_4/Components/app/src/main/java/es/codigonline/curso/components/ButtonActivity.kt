package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.curso.components.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "Me has clicado", Toast.LENGTH_LONG).show()
        }

        binding.button.setOnLongClickListener {
            Toast.makeText(this, "Me has clicado de forma larga", Toast.LENGTH_LONG).show()
            return@setOnLongClickListener true
        }
    }
}