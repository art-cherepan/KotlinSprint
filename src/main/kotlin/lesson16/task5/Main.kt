package lesson16.task5

fun main() {
    val frodo = Player(
        name = "Frodo",
        impactForce = 15.0,
        health = 80.0,
    )

    val gandalf = Player(
        name = "Ganfalf",
        impactForce = 150.0,
        health = 450.0
    )

    frodo.takeDamage(13.4)
    frodo.increaseHealth(4.3)
    gandalf.takeDamage(3.5)
    frodo.takeDamage(34.7)
    gandalf.takeDamage(7.5)
    frodo.takeDamage(23.8)
    frodo.increaseHealth(8.7)
    gandalf.takeDamage(4.6)
    frodo.takeDamage(45.8)

    println(frodo.getPlayerHealthStatus())
    println(gandalf.getPlayerHealthStatus())
}

class Player(
    private val name: String,
    private var impactForce: Double,
    private var health: Double,
) {
    private var opportunityToBeTreated: Boolean = true

    fun takeDamage(amountOfDamage: Double) {
        health -= amountOfDamage

        if (health < 0) {
            occurrenceOfDeath()
        }
    }

    fun increaseHealth(healthGain: Double) {
        if (opportunityToBeTreated) {
            health += healthGain
        }
    }

    fun getPlayerHealthStatus(): String {
        if (health > 0) {
            return "Игрок $name жив"
        }

        return "Игрок $name мертв"
    }

    private fun occurrenceOfDeath() {
        impactForce = 0.0
        health = 0.0
        opportunityToBeTreated = false
    }
}