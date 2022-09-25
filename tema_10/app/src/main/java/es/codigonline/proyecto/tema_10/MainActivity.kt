package es.codigonline.proyecto.tema_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.sqlite.db.SimpleSQLiteQuery
import es.codigonline.proyecto.tema_10.database.AppDatabase
import es.codigonline.proyecto.tema_10.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        lifecycleScope.launch {
            withContext(Dispatchers.IO){
                AppDatabase.init(this@MainActivity).query(SimpleSQLiteQuery("SELECT 1"))
            }
        }

    }
}