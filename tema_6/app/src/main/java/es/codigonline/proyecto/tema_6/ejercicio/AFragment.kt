package es.codigonline.proyecto.tema_6.ejercicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.FragmentABinding


class AFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentABinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goToB.setOnClickListener {
            val nombre = binding.tieNombre.text.toString()
            val edad = binding.tieEdad.text.toString()

            Toast.makeText(requireContext(), "$nombre - $edad", Toast.LENGTH_SHORT).show()
            
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}