package es.codigonline.proyecto.tema_6.navegacion

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import es.codigonline.proyecto.tema_6.R
import es.codigonline.proyecto.tema_6.databinding.FragmentDosBinding
import es.codigonline.proyecto.tema_6.databinding.FragmentTresBinding

class TresFragment : Fragment() {
    private val binding get() = _binding!!
    private var _binding: FragmentTresBinding? = null

    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentTresBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity?.lifecycleScope?.launchWhenCreated {
            navController = (requireActivity() as NavegacionActivity).navController
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toUnoFragment.setOnClickListener {
            navController.navigate(TresFragmentDirections.toUnoFragment())
        }
        binding.toDosFragment.setOnClickListener {
            navController.navigate(TresFragmentDirections.toDosFragment(1000))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}