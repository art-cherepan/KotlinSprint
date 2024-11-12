package lesson16.task1

fun main() {
    val dice = Dice()

    dice.printMeaning()
}

class Dice {
    private val meaning: Int = (1 .. 6).random()

    fun printMeaning() {
        println(meaning)
    }
}