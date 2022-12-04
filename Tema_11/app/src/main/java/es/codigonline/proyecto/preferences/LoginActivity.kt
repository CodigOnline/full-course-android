package es.codigonline.proyecto.preferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.codigonline.proyecto.preferences.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val preferences = App.preferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isLogged()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun isLogged() {

        val isLogged = preferences.getBoolean(getString(R.string.prefs_is_loggued), false)
        if (isLogged) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        checkPreferences()

        binding.login.setOnClickListener {

            //RECUPERAR EL USUARIO Y LA CONTRASEÑA INTRODUCIDAS
            val email = binding.tietEmail.text.toString()
            val password = binding.tietPassword.text.toString()

            //COMPROBAR CON LA BD SI EL USUARIO Y LA CONTRASEÑA SON CORRECTOS

            //SI ES CORRETO ACTUAR EN CONSECUENCIA

            if (binding.cbRecordar.isChecked) {
                //GUARDAR EL EMAIL Y LA CONTRASEÑA PARA LA PROXIMA VEZ
                Toast.makeText(this, "GUARDANDO...", Toast.LENGTH_LONG).show()

                preferences.edit().apply {
                    putBoolean(getString(R.string.prefs_checkbox_recordar), true)
                    putString(getString(R.string.prefs_user_email), email)
                    putString(getString(R.string.prefs_user_password), password)
                    apply()
                }
            } else {
                preferences.edit().apply {
                    remove(getString(R.string.prefs_checkbox_recordar))
                    remove(getString(R.string.prefs_user_email))
                    remove(getString(R.string.prefs_user_password))
                    apply()
                }
            }

            preferences.edit().apply {
                putBoolean(getString(R.string.prefs_is_loggued), true)
                apply()
            }
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun checkPreferences() {

        val checked = preferences.getBoolean(getString(R.string.prefs_checkbox_recordar), false)
        if (checked) {
            val email = preferences.getString(getString(R.string.prefs_user_email), "")
            val password = preferences.getString(getString(R.string.prefs_user_password), "")
            binding.tietEmail.setText(email)
            binding.tietPassword.setText(password)
            binding.cbRecordar.isChecked = true
        }

    }

}