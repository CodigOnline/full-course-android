package es.codigonline.proyecto.tema_7.rv_title

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.codigonline.proyecto.tema_7.databinding.ActivityRecyclerTitleBinding

class RecyclerTitleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerTitleBinding
    private val adapter = RvTitleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerTitleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val productos = mutableListOf(
            Producto(1, "Test1", "A"),
            Producto(2, "Test2", "B"),
            Producto(3, "Test3", "C"),
            Producto(4, "Test4", "A"),
            Producto(5, "Test5", "A"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
            Producto(6, "Test6", "B"),
        )


        adapter.addAll(productos)

        binding.recyclerview.apply {
            adapter = this@RecyclerTitleActivity.adapter
            layoutManager =
                LinearLayoutManager(this@RecyclerTitleActivity, RecyclerView.VERTICAL, false)
        }

    }
}