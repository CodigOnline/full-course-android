package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import es.codigonline.curso.components.databinding.ActivityProgressBinding

class ProgressActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProgressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var isLoading = false


        binding.btn.setOnClickListener {
            if (isLoading){
                isLoading=false
                binding.progressHorizontal.visibility = View.GONE
                binding.progressCircular.visibility = View.GONE
                binding.btn.text = "Iniciar"
            }
            else{
                isLoading=true
                binding.progressHorizontal.visibility = View.VISIBLE
                binding.progressCircular.visibility = View.VISIBLE
                binding.btn.text="Detener"
            }
        }

    }
}