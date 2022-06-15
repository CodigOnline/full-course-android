package es.codigonline.curso.miprimeraapp.ui

enum class Damage(val multiply: Double) {
    HIGH(2.0),
    NORMAL(1.0),
    LOW(0.5);

    fun attack(enemy: Enemy, damage: Double) {
        enemy.live -= multiply * damage
        if (enemy.live <= 0)
            enemy.isAlive = false
    }
}

data class Enemy(var live: Double, val name: String, var isAlive: Boolean = true) {



}

class Player(val name: String, var damage: Double) {
    fun highAttack(enemy: Enemy) {
        Damage.HIGH.attack(enemy, damage)
    }

    fun attack(enemy: Enemy) {
        Damage.NORMAL.attack(enemy, damage)
    }

    fun lowAttack(enemy: Enemy) {
        Damage.LOW.attack(enemy, damage)
    }
}

fun main() {
    val enemy = Enemy(100.0,"Thanos")
    val player = Player("IronMan", 100.0)
    val player2 = Player("Thor", 1000.0)
    println(enemy.isAlive)
    for (i in 1..5)
        player2.highAttack(enemy)
    println(enemy.live)
    println(enemy.isAlive)
}