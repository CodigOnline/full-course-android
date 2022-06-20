package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doBeforeTextChanged
import com.google.android.material.textfield.TextInputEditText
import es.codigonline.curso.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
                it.delete(15,length)
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