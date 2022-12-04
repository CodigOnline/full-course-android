package es.codigonline.proyecto.preferences


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.codigonline.proyecto.preferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val preferences = App.preferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.close.setOnClickListener {
            preferences.edit().apply {
                remove(getString(R.string.prefs_is_loggued))
                apply()

            }
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}