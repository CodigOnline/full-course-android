package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import com.google.android.material.textfield.TextInputEditText
import es.codigonline.curso.components.databinding.ActivityTextInputBinding
import es.codigonline.curso.components.entities.Usuario

class TextInputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTextInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextInputBinding.inflate(layoutInflater)

       /* val nombre = intent.extras?.getString("nombre")
        nombre?.let {
            binding.textInputETNamePerson.setText(it)
        }
        val edad = intent.extras?.getInt("edad")
        edad?.let {
            val data = "${binding.textInputETNamePerson.text.toString()} - ${it}"
            binding.textInputETNamePerson.setText(data)
        }*/

        val usuario = intent.extras!!.getParcelable<Usuario>("usuario")


        usuario?.let{
            val data = "${it.nombre} - ${it.edad}"
            binding.textInputETNamePerson.setText(data)
        }
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.textInputETNamePerson.setOnFocusChangeListener { editText, isFocus ->
            if (isFocus) {
                binding.textInputLayoutNamePerson.error = null
                return@setOnFocusChangeListener
            }


            val length = (editText as TextInputEditText).length()

            //switch
            //when
            when {
                length in 0..9 -> {
                    binding.textInputLayoutNamePerson.error =
                        "El nombre debe de contener como mínimo 10 letras"
                }
                length > 50 -> {
                    binding.textInputLayoutNamePerson.error =
                        "El nombre debe de contener entre 10 y 50 letras"
                }
                else -> {
                    binding.textInputLayoutNamePerson.error = null
                }
            }
        }

        binding.textInputETNamePerson.doAfterTextChanged {
            val length = it!!.length
            if (length > 15) {
                it.delete(15, length)
            }

        }


        binding.textInputETNamePerson.addTextChangedListener { editText ->

            editText?.let { notNullEditText ->
                val length = notNullEditText.length
                //switch
                //when
                when {
                    length > 50 -> {
                        binding.textInputLayoutNamePerson.error =
                            "El nombre debe de contener entre 10 y 50 letras"
                    }
                    else -> {
                        binding.textInputLayoutNamePerson.error = null
                    }
                }

            }


        }


    }
}