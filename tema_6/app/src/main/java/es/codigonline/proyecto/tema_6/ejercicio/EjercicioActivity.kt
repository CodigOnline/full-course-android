package es.codigonline.proyecto.tema_6.ejercicio

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.ActivityEjercicioBinding

class EjercicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicioBinding
    private var orientation = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.beginTransaction()
                .add(binding.fragmentA!!.id,AFragment())
                .add(binding.fragmentB!!.id, BFragment())
                .commit()
        } else {
            supportFragmentManager.beginTransaction().add(binding.fragmentA!!.id, AFragment())
                .commit()
        }
    }
}