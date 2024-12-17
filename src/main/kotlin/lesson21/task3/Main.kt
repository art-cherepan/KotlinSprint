package lesson21.task3

fun main() {
    val micky = Player(
        name = "Micky",
        maxHealth = 100.0,
        currentHealth = 90.8,
    )

    println("Игрок ${micky.getName()} здоров: ${micky.isHealthy()}")

    val harry = Player(
        name = "Harry",
        maxHealth = 100.0,
        currentHealth = 100.0,
    )

    println("Игрок ${harry.getName()} здоров: ${harry.isHealthy()}")
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
}

fun Player.isHealthy(): Boolean {
    return this.getCurrentHealth() == this.getMaxHealth()
}