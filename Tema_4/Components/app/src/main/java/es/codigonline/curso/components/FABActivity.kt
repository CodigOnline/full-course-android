package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.curso.components.databinding.ActivityFabBinding

class FABActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var isOpened = true
        binding.fab.setOnClickListener {
            if (isOpened) {
                binding.extendedFab.shrink()
                isOpened = false
            } else {
                binding.extendedFab.extend()
                isOpened = true
            }
        }
    }
}