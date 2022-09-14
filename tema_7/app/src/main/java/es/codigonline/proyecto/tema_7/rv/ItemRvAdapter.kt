package es.codigonline.proyecto.tema_7.rv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import es.codigonline.proyecto.tema_7.databinding.ItemBinding
import es.codigonline.proyecto.tema_7.listview.Persona

class ItemRvAdapter : RecyclerView.Adapter<ItemRvAdapter.ViewHolder>() {

    var items = mutableListOf<Persona>()
        set(value) {
            field = value
            /*INFORMA AL ADAPTADOR QUE LOS DATOS HAN CAMBIADO POR COMPLETO*/
            notifyDataSetChanged()
        }

    fun add(persona: Persona) {
        items.add(persona)
        notifyItemInserted(items.size)

    }

    fun edit(persona: Persona) {
        // Persona(1,"alvaro",28)
        // Persona(1,"Alvaro",28)

        val pos = items.indexOf(persona)
        items[pos] = persona

        notifyItemChanged(pos)
    }

    fun delete(persona: Persona) {
        val pos = items.indexOf(persona)
        items.removeAt(pos)
        notifyItemRemoved(pos)
    }

    class ViewHolder private constructor(
        val binding: ItemBinding,
        val context: Context
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(persona: Persona) {
            binding.name.text = persona.name
            binding.dir.text = persona.dir


        }

        companion object {
            fun newInstance(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding, parent.context)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        return ViewHolder.newInstance(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])

    }

    override fun getItemCount(): Int {
        return items.size
    }
}