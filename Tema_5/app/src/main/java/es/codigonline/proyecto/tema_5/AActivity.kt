package es.codigonline.proyecto.tema_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import es.codigonline.proyecto.tema_5.databinding.ActivityABinding

class AActivity : AppCompatActivity() {
    private lateinit var binding: ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.goToB.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
            contractWithB.launch(intent)
            // startActivity(intent)
        }
    }

    val contractWithB =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            //QUE QUEREMOS HACER CON EL RESULTADO
            // Toast.makeText(this,"HEMOS VUELTO",Toast.LENGTH_SHORT).show()
            when (result.resultCode) {
                RESULT_OK -> {
                    Toast.makeText(this, "RESULTADO OK", Toast.LENGTH_SHORT).show()
                    val intent = result.data!!
                    val extras = intent.extras!!
                    val texto = extras.getString("texto")!!
                    binding.tv.setText(texto)
                   // Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
                }
            }

        }
}