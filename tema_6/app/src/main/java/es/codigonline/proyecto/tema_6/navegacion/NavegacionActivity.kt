package es.codigonline.proyecto.tema_6.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.ActivityNavegacionBinding

class NavegacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavegacionBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavegacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.navhost) as NavHostFragment
        navController = navHost.navController
    }
}