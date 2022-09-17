package es.codigonline.proyecto.tema_7.rv_title

data class Producto(val id: Int, val nombre: String, val marca: String){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Producto

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}
