package es.codigonline.curso.components

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import es.codigonline.curso.components.databinding.ActivityLauncherBinding
import es.codigonline.curso.components.entities.Usuario

class LauncherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLauncherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("APP", "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("APP", "onStart()")
        binding.btnTopAppBar.setOnClickListener {
            val intent = Intent(this, TopAppBarActivity::class.java)
            startActivity(intent)
        }
        binding.btnBottomappbar.setOnClickListener {
            val intent = Intent(this, BottomAppBarActivity::class.java)
            startActivity(intent)
        }
        binding.btnButtonActivity.setOnClickListener {
            val intent = Intent(this,ButtonActivity::class.java)
            startActivity(intent)
        }
        binding.btnCard.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
        binding.btnDialog.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
        binding.btnFab.setOnClickListener {
            val intent = Intent(this, FABActivity::class.java)
            startActivity(intent)
        }
        binding.btnImage.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
        binding.btnProgress.setOnClickListener {
            val intent = Intent(this, ProgressActivity::class.java)
            startActivity(intent)
        }
        binding.btnSelections.setOnClickListener {
            val intent = Intent(this, SelectionsActivity::class.java)
            startActivity(intent)
        }
        binding.btnTextInput.setOnClickListener {
            val intent = Intent(this, TextInputActivity::class.java)
/*            intent.putExtra("nombre","Alvaro Ortega")
            intent.putExtra("edad",28)*/

            val usuario = Usuario("Alvaro Ortega",28)
            intent.putExtra("usuario",usuario)
            startActivity(intent)
        }
        binding.btnTime.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onResume() {
        super.onResume()
        Log.d("APP", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("APP", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("APP", "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("APP", "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("APP", "onDestroy()")
    }
}