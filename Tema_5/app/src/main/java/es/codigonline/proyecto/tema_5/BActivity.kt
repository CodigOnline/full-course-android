package es.codigonline.proyecto.tema_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.codigonline.proyecto.tema_5.databinding.ActivityBBinding

class BActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()

        binding.returnToA.setOnClickListener {
            val intent = Intent()
            val texto = binding.tie.text.toString()
            if (texto.isBlank()){
                finish()
            }
            intent.putExtra("texto", texto)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}