package es.codigonline.curso.miprimeraapp.ui
import kotlin.jvm.Throws

/*
Para ello deberás crear la clase Coche
El atributo cantidad de puertas debe ser >= 3 y más pequeño de 8
Esto se debe controlar en el setter y en el constructor
El toString debe mostrar los datos correctos obviando los privados.


 */

data class Coche
@Throws(ExceptionInInitializerError::class) constructor(
    val marca: String,
    val modelo: String,
    val color: String,
    private var _cantidadDePuertas: Int
) {
    init {
        println("Iniciando coche")
        /*if (_cantidadDePuertas<3)
            _cantidadDePuertas=3
        else if(_cantidadDePuertas>8){
            _cantidadDePuertas=7
        }*/
        if (_cantidadDePuertas !in 3..7) {
            throw ExceptionInInitializerError("La cantidad de puertas debe estar entre 3 y 7")
        }
    }

    var cantidadDePuertas = _cantidadDePuertas
        set(value) {
            if (value !in 3..7) {
                throw ExceptionInInitializerError("La cantidad de puertas debe estar entre 3 y 7")
            }
            field = value
        }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', color='$color', cantidadDePuertas=$cantidadDePuertas)"
    }
}

fun main() {
    try {
        val renault = Coche("Renault", "Megane", "Rojo", 1)

        println(renault)
    } catch (ex: ExceptionInInitializerError) {
        println(ex.message)
    }

    try {

        val opel = Coche(
            "Opel",
            "Astra",
            "Gris",
            11
        )

        println(opel)
    } catch (ex: ExceptionInInitializerError) {
        println(ex.message)
    }
    try {

        var seat = Coche(
            "Seat",
            "Leon",
            "Azul electrico",
            1
        )
        seat.cantidadDePuertas = 1
        println(seat)
    } catch (ex: ExceptionInInitializerError) {
        println(ex.message)
    }


}
