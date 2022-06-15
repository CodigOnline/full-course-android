package es.codigonline.curso.miprimeraapp.ui

interface Vehiculo {
    fun arrancar() {
        println("Encendiendo motor")
    }
    fun frenar()
}
interface Terrestre{
    fun derrapar()
    fun arrancar() {
        println("Quitando freno de mano...")
    }
    fun frenar()
}

class Bici : Vehiculo,Terrestre {
    override fun arrancar() {
        println("Arrancando...")
        super<Vehiculo>.arrancar()
        super<Terrestre>.arrancar()
    }

    override fun frenar() {
        println("Frenando...")
    }

    override fun derrapar() {
        println("Derrapando...")
    }

}

fun main() {
    Bici().also {
        it.arrancar()
        it.frenar()
        it.derrapar()
    }
}