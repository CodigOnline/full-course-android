package es.codigonline.proyecto.tema_6.ejercicio

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import es.codigonline.proyecto.tema_6.databinding.FragmentABinding


class AFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentABinding? = null
    private val activity get() = _activity!!
    private var _activity: EjercicioActivity? = null
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
            val edad = binding.tieEdad.text.toString().toInt()
            Toast.makeText(requireContext(), "$nombre - $edad", Toast.LENGTH_SHORT).show()
            activity.loadFragmentB(nombre, edad)

            /*if (activity.orientation == Configuration.ORIENTATION_LANDSCAPE){
                activity.supportFragmentManager.beginTransaction()
                    .replace(activity.binding.fragmentB!!.id,BFragment.newInstance(nombre,edad))
                    .commit()
            }
            else{
                activity.supportFragmentManager.beginTransaction()
                    .replace(activity.binding.fragmentA!!.id,BFragment.newInstance(nombre,edad))
                    .addToBackStack(null)  //simulación de la pila de actividades
                    .commit()
            }*/

        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        _activity = requireActivity() as EjercicioActivity
    }

    override fun onDetach() {
        super.onDetach()
        _activity = null
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}