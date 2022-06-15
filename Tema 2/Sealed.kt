package es.codigonline.curso.miprimeraapp.ui

import es.codigonline.curso.miprimeraapp.R
sealed class Result<in T>{
    data class OK<T>(val data:T):Result<T>()
    data class KO(val message:String):Result<Nothing>()
}
sealed class Color {
    data class Primario(val name: String, val hex: String, val res: Int) : Color()
    data class Secundario(
        val name: String,
        val hex: String,
        val res: Int,
        val primarios: List<Primario>
    ) : Color() {
        init {
            if (primarios.size != 2) {
                throw IllegalArgumentException("Un color secundario debe estar formado por dos colores primarios")
            }
        }
    }

    data class Terciario(
        val name: String,
        val hex: String,
        val res: Int,
        val primario: Primario,
        val secundario: Secundario
    ) : Color()


    data class User(val id: Long, val username: String, val email: String)

    fun main() {
        val rojo = Color.Primario("Rojo", "FF0000", R.color.red)
        val azul = Color.Primario("Azul", "0048FF", R.color.azul)
        val amarillo = Color.Primario("Amarallo", "FFE600", R.color.amarillo)

        val verde = Color.Secundario("Verde", "44FF00", R.color.verde, listOf(azul, amarillo))
        println(verde)
        evalColor(rojo)
        evalColor(azul)
        evalColor(amarillo)
        evalColor(verde)

        val ok = Result.OK<Coche>(Coche("Renault", "Megane", "Rojo", 3))
        println(ok)

        val result = login("abcd", "123456")
        when (result) {
            is Result.OK<*> -> println(result.data)
            is Result.KO -> println(result.message)
        }


    }

    fun login(username: String, password: String): Result<*> {
        if (username == "abcd" && password == "123456") {
            return Result.OK<User>(User(1, "alvaro", "info@codigonline.es"))
        }
        return Result.KO("Los datos introducidos son incorrectos")

    }

    fun evalColor(color: Color) {
        when (color) {
            is Color.Primario -> {
                println("El color: ${color.name} es un color primario")
            }
            is Color.Secundario -> {
                println("El color: ${color.name} es un color secundario")
            }
            is Color.Terciario -> {
                println("El color: ${color.name} es un color terciario")
            }
        }
    }
}