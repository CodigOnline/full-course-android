package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import es.codigonline.curso.components.databinding.ActivityDialogBinding

class DialogActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openDialog.setOnClickListener {
            MaterialAlertDialogBuilder(this@DialogActivity)
                .setTitle(resources.getString(R.string.title))
                .setMessage(resources.getString(R.string.supporting_text))
                .setOnCancelListener {
                    Toast.makeText(this@DialogActivity,"Cerrado",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton(resources.getString(R.string.cancelar)) { dialog, which ->
                    // Respond to negative button press
                    Toast.makeText(this@DialogActivity,"Cancelado",Toast.LENGTH_LONG).show()
                }
                .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
                    // Respond to positive button press
                    Toast.makeText(this@DialogActivity,"Aceptado",Toast.LENGTH_LONG).show()
                }
                .show()
        }
    }
}