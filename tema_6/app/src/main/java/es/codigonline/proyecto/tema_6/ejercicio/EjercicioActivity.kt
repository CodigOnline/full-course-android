package es.codigonline.proyecto.tema_6.ejercicio

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.ActivityEjercicioBinding

class EjercicioActivity : AppCompatActivity(), AFragment.LogicaFragmentA {

    lateinit var binding: ActivityEjercicioBinding
    var orientation = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.beginTransaction()
                .add(binding.fragmentA!!.id,AFragment())
                .add(binding.fragmentB!!.id, BFragment.newInstance("Alvaro",28))
                .commit()
        } else {
            supportFragmentManager.beginTransaction().add(binding.fragmentA!!.id, AFragment())
                .commit()
        }
    }

    override fun goToB(nombre:String, edad:Int){
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentB!!.id,BFragment.newInstance(nombre,edad))
                .commit()
        }
        else{
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentA!!.id,BFragment.newInstance(nombre,edad))
                .addToBackStack(null)  //simulación de la pila de actividades
                .commit()
        }
    }
}