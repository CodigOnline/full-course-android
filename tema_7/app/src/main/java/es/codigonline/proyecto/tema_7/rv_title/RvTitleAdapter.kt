package es.codigonline.proyecto.tema_7.rv_title

import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.codigonline.proyecto.tema_7.databinding.ItemProductoBinding
import es.codigonline.proyecto.tema_7.databinding.TitleProductoBinding


class RvTitleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val ITEM_VIEW_TYPE_TITLE = 0
    private val ITEM_VIEW_TYPE_PRODUCTO = 1

    sealed class DataItem {
        data class ProductoItem(val producto: Producto) : DataItem() {}
        data class ProductoTitle(val title: String) : DataItem() {}
    }

    var items = mutableListOf<DataItem>()

    class TitleViewHolder private constructor(val binding: TitleProductoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {
            binding.textView.text = title
        }

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
        fun bind(producto: Producto) {
            binding.id.text = producto.id.toString()
            binding.name.text = producto.nombre
        }

        companion object {
            fun newInstance(parent: ViewGroup): ProductoViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemProductoBinding.inflate(layoutInflater, parent, false)
                return ProductoViewHolder(binding)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is DataItem.ProductoTitle -> ITEM_VIEW_TYPE_TITLE
            is DataItem.ProductoItem -> ITEM_VIEW_TYPE_PRODUCTO
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_VIEW_TYPE_TITLE -> TitleViewHolder.newInstance(parent)
            ITEM_VIEW_TYPE_PRODUCTO -> ProductoViewHolder.newInstance(parent)
            else -> throw java.lang.ClassCastException("No se ha reconocido el tipo $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TitleViewHolder -> {
                holder.bind((items[position] as DataItem.ProductoTitle).title)
            }
            is ProductoViewHolder -> {
                holder.bind((items[position] as DataItem.ProductoItem).producto)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}