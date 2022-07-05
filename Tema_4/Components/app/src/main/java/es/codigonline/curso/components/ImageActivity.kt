package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.curso.components.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img1.setOnClickListener {
            Toast.makeText(this,"IMG1",Toast.LENGTH_SHORT).show()
        }
    }
}