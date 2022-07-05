package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.curso.components.databinding.ActivityCardBinding

class CardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.card.setOnClickListener {
            Toast.makeText(this,"CARD",Toast.LENGTH_SHORT).show()
        }
        binding.btn1.setOnClickListener { Toast.makeText(this,"BTN1",Toast.LENGTH_SHORT).show() }
        binding.btn2.setOnClickListener { Toast.makeText(this,"BTN2",Toast.LENGTH_SHORT).show() }

    }
}