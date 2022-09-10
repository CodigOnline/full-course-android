package es.codigonline.proyecto.tema_7.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import es.codigonline.proyecto.tema_7.databinding.ItemBinding

class ItemAdapter(val ctx: Context, val items: List<Persona>) :
    ArrayAdapter<Persona>(ctx, 0, items) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val binding = ItemBinding.inflate(LayoutInflater.from(ctx), parent, false)
        binding.name.text = items[position].name
        binding.dir.text = items[position].dir

        return binding.root
    }
}