package lesson20.task2

fun main() {
    val playerOleg = Player(
        name = "Oleg",
        maxHealth = 100.0,
        currentHealth = 67.8,
    )

    val takePotion = { player: Player -> player.takePotion() }
    takePotion(playerOleg)

    println("Игрок ${playerOleg.getName()} выпил зелье. Теперь его текущий уровень здоровья: ${playerOleg.getCurrentHealth()}")
}

class Player(
    private val name: String,
    private val maxHealth: Double,
    private var currentHealth: Double,
) {
    fun getName(): String {
        return name
    }

    fun getMaxHealth(): Double {
        return maxHealth
    }

    fun getCurrentHealth(): Double {
        return currentHealth
    }

    fun takePotion() {
        currentHealth = maxHealth
    }
}