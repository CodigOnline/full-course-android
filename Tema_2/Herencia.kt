package es.codigonline.curso.miprimeraapp.ui


abstract class Transporte {

    init{
        println("Creando transporte")
    }
}

open class Areo : Transporte() {
    open var nombre="Areo"
    init{
        println("Creando Areo")
    }
    open fun despegar() {
        println("Despegando...")
    }
}

class Avion : Areo() {
    override var nombre = "Avion"
    init{
        println("Creando Avion")
    }
    override fun despegar(){
        println("Revisando pista de despegue...")
        super.despegar()
    }


}


fun main() {
    val boieng = Avion().also {
        it.despegar()
        println(it.nombre)
    }
}