package es.codigonline.curso.miprimeraapp.ui

data class Functions(var name: String) {
    lateinit var description: String
    lateinit var description1: String
    lateinit var description2: String
    lateinit var description3: String

    constructor(name: String, description: String) : this(name) {
        this.description = description
    }
}

class Adapter() {
    lateinit var description: String
    lateinit var description1: String
    lateinit var description2: String
    lateinit var description3: String

    fun showElem1() {
        println(description)
    }

    fun showElem2() {
        println(description1)
    }

    fun showElem3() {
        println(description2)
    }

    fun showElem4() {
        println(description3)
    }
}

fun main() {

    //este valor viene de BD o lo introduce el usuario
    val function1: Functions? = Functions("let")

    if (function1 != null) {
        println(function1.name)
    }

    function1?.let {
        println(it)
    }


    val function2: Functions = Functions("apply")
    function2.description = "patata"
    function2.description1 = "patata1"
    function2.description2 = "patata2"
    function2.description3 = "patata3"

    println("${function2.description} ${function2.description1} ${function2.description2} ${function2.description3} ")

    function2.apply {
        description = "patata"
        description1 = "patata1"
        description2 = "patata2"
        description3 = "patata3"
        println("$description $description1 $description2 $description3 ")
    }

    val adapter = Adapter().apply {
        description = "patata"
    }

    val function4 = Functions("also")
        .also {
            it.description1 = "test"
            println(it)
            println(it.description1)
        }

/*
    with(adapter) {
        showElem1()
        showElem2()
        showElem3()
    }
    adapter.showElem1()
    adapter.showElem2()
    adapter.showElem3()

*/
}