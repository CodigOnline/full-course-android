package es.codigonline.proyecto.tema_7.listview

data class Persona(val id:Long, var name: String, var dir: String){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true //MISMA DIRECCIÓN DE MEMORIA
        if (javaClass != other?.javaClass) return false //CLASE ES DIFERENTE

        other as Persona

        if (id != other.id) return false //IDS DIFERENTES


        return true
    }


    override fun hashCode(): Int {
        return id.hashCode()
    }
}
