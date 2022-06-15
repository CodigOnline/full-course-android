package es.codigonline.curso.miprimeraapp.ui

import android.graphics.Color
import android.telephony.mbms.MbmsErrors
import kotlin.jvm.Throws

/*
Crea 3 mapas donde se identifique un coche y sus partes
Marca: String
Modelo: String
Color: String
Cantidad de puertas: Int

 */

fun main() {
    val renault = mutableMapOf<String, Any>(
        "marca" to "Renault",
        "modelo" to "Megane",
        "color" to "Rojo",
        "cantidadDePuertas" to 5

    )
    val opel = mutableMapOf<String, Any>(
        "marca" to "Opel",
        "modelo" to "Astra",
        "color" to "Gris",
        "cantidadDePuertas" to 5

    )
    val seat = mutableMapOf<String, Any>(
        "marca" to "Seat",
        "modelo" to "Leon",
        "color" to "Azul electrico",
        "cantidadDePuertas" to 3

    )
    println(renault)
    println(opel)
    println(seat)

    println(opel["modelo"])
    println(opel.remove("cantidadDePuertas"))
    println(opel.containsKey("modelo"))
    println(opel)


}
