package es.codigonline.curso.miprimeraapp.ui

/*
Crea una listas de String utilizando mutableList
Crea una listas de String utilizando List
Crea una listas de String utilizando Set
Crea una lista genérica que admita todos las clases
Crea una lista en la que se pueda poner cualquier tipo de numero
Entero o Decimal
 */

fun main() {
    val mutableList = mutableListOf<String>()
    mutableList.add("HOLA")
    mutableList.add("HOLA")
    mutableList.add("EL")
    mutableList.add("ELLA")

    val list = listOf<String>(
        "HOLA", "HOLA", "EL", "ELLA"
    )

    val set = setOf<String>("HOLA", "HOLA", "EL", "ELLA")

    val listaGenerica = listOf<Any>(1,"2",3.0,true)

    val listaNumerica = listOf<Number>(1,1L,1.0,1.0f)

    println(mutableList)
    println(list)
    println(set)
    println(listaGenerica)
    println(listaNumerica)


}
