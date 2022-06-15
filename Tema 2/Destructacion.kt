package es.codigonline.curso.miprimeraapp.ui


data class Rotulador(var color: String, var nivelTinta: Double, val marca:String)


fun main() {
    val map = mutableMapOf<String,Rotulador>().apply {
        put("Rojo",Rotulador("Rojo",100.0,"Pilot"))
        put("Azul",Rotulador("Azul",100.0,"Pilot"))
        put("Negro",Rotulador("Negro",100.0,"Pilot"))
        put("Morado",Rotulador("Morado",100.0,"Pilot"))
    }

    for ((color,rotulador) in map){
        println(color)
        println("\t $rotulador")
    }
    for ((_,rotulador) in map){
        println("\t $rotulador")
    }

    val (color,tinta) = getColor()

    println(color)
    println(tinta)
}


fun getColor():Rotulador{
    return Rotulador("Verde",100.0,"Pilot")
}