package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import es.codigonline.curso.components.databinding.ActivitySelectionsBinding

class SelectionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
            }
        }
        binding.switchMaterial.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
            }
        }

        val radio1 = binding.radio1.id
        val radio2 = binding.radio2.id
        val radio3 = binding.radio3.id


        binding.radioGroup.setOnCheckedChangeListener { _, radioID ->

            when (radioID) {
                radio1 -> Toast.makeText(this@SelectionsActivity, "Hombre", Toast.LENGTH_LONG)
                    .show()
                radio2 -> Toast.makeText(this@SelectionsActivity, "Mujer", Toast.LENGTH_LONG).show()
                else -> Toast.makeText(this@SelectionsActivity, "Otro", Toast.LENGTH_LONG).show()
            }

        }

        //binding.radioGroup.checkedRadioButtonId
    }
}