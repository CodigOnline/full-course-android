package es.codigonline.proyecto.tema_7.rv_title

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.codigonline.proyecto.tema_7.databinding.ItemProductoBinding
import es.codigonline.proyecto.tema_7.databinding.TitleProductoBinding

class RvTitleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class TitleViewHolder private constructor(val binding: TitleProductoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {}

        companion object {
            fun newInstance(parent: ViewGroup): TitleViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = TitleProductoBinding.inflate(layoutInflater, parent, false)
                return TitleViewHolder(binding)
            }
        }
    }

    class ProductoViewHolder private constructor(val binding: ItemProductoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {}

        companion object {
            fun newInstance(parent: ViewGroup): ProductoViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemProductoBinding.inflate(layoutInflater, parent, false)
                return ProductoViewHolder(binding)
            }
        }
    }
}