package lesson20.task3

fun main() {
    val randomPlayer = Player(hasKey = false)

    val checkKey = { player: Player ->
        if (player.checkKey()) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    println(checkKey(randomPlayer))
    randomPlayer.giveKey()
    println(checkKey(randomPlayer))
}

class Player(private var hasKey: Boolean) {
    fun giveKey() {
        hasKey = true
    }

    fun pickUpKey() {
        hasKey = false
    }

    fun checkKey(): Boolean {
        return hasKey
    }
}