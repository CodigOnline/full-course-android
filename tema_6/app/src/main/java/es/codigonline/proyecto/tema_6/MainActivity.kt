package es.codigonline.proyecto.tema_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.codigonline.proyecto.tema_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.addFragment.setOnClickListener {

            val supportFragmentManager = supportFragmentManager
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(binding.llFragments.id, UsuarioFragment())
            transaction.commit()
        }
    }
}