package es.codigonline.proyecto.tema_6.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.navArgs
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.FragmentDosBinding
import es.codigonline.proyecto.tema_6.databinding.FragmentUnoBinding


class DosFragment : Fragment() {
    private val binding get() = _binding!!
    private var _binding: FragmentDosBinding? = null
    private val args: DosFragmentArgs by navArgs()
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        navController = (requireActivity() as NavegacionActivity).navController
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val edad = args.edad
        binding.tv1.text = edad.toString()
        binding.toTresFragment.setOnClickListener {
            navController.navigate(DosFragmentDirections.toTresFragment())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}