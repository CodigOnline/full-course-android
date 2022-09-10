package es.codigonline.proyecto.tema_7.rv

import android.view.LayoutInflater
import android.view.ViewGroup
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

    class ViewHolder private constructor(val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun getView(persona: Persona) {
            binding.name.text = persona.name
            binding.dir.text = persona.dir
        }

        companion object {
            fun newInstance(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.getView(items[position])

    override fun getItemCount() = items.size
}