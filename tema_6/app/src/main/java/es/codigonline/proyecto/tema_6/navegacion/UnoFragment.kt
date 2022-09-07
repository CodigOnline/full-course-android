package es.codigonline.proyecto.tema_6.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.FragmentUnoBinding

class UnoFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentUnoBinding? = null

    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentUnoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        navController = (requireActivity() as NavegacionActivity).navController
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toDosFragment.setOnClickListener {
            val edad = binding.tieEdad.text.toString()
            if (edad.isBlank()){
                Toast.makeText(requireContext(),"Introduce una edad",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            navController.navigate(UnoFragmentDirections.toDosFragment(edad.toInt()))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}