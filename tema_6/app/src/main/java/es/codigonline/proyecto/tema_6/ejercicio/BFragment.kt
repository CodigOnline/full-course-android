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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

}