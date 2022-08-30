package es.codigonline.proyecto.tema_6.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import es.codigonline.proyecto.tema_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()
        transaction.replace(binding.fragment.id, UsuarioFragment(), "usuarioFragment")
        transaction.commit()

    }

    override fun onStart() {
        super.onStart()
        binding.addFragment.setOnClickListener {

            val blankFragment =
                fragmentManager.findFragmentByTag("blankFragment") as BlankFragment?
            blankFragment?.let { //if
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(binding.fragment.id, UsuarioFragment(), "usuarioFragment")
                transaction.commit()
            } ?: run { //else
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(binding.fragment.id, BlankFragment(), "blankFragment")
                transaction.commit()
            }

        }
    }
}