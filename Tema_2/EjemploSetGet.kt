package es.codigonline.curso.miprimeraapp.ui

data class Enemigo(private var _live: Double, val name: String) {
    var isAlive = true

    var live = _live
        set(value) {
            if (value < 0)
                return
            field = value
            if (value == 0.0)
                isAlive = false
        }


    override fun toString(): String {
        return "Enemigo(live=$live, name='$name', isAlive=$isAlive)"
    }

}

data class Rectangulo(val ancho: Double, val largo: Double) {
    var area: Double
        get() = ancho * largo
        private set(value){}

    override fun toString(): String {
        return "Rectangulo(ancho=$ancho, largo=$largo, area=$area)"
    }


}

fun main() {
    val enemy = Enemigo(100.0, "Bruja Escarlata")
    println(enemy)
    enemy.live = 0.0
    println(enemy)
    enemy.isAlive = false

    val rect = Rectangulo(20.0,10.0)
    println(rect)

}