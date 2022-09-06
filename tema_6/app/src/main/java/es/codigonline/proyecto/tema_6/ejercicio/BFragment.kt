package es.codigonline.proyecto.tema_6.ejercicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.FragmentABinding
import es.codigonline.proyecto.tema_6.databinding.FragmentBBinding


class BFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentBBinding? = null

    private lateinit var nombre: String
    private var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nombre = it.getString("nombre")!!
            edad = it.getInt("edad")


        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.edad.text = edad.toString()
        binding.nombre.text = nombre
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object { //static
        @JvmStatic
        fun newInstance(nombre: String, edad: Int): BFragment {
            return BFragment().apply {
                arguments = Bundle().apply {
                    putString("nombre", nombre)
                    putInt("edad", edad)
                }
            }
        }
    }

}