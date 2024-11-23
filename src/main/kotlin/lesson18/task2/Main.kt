package lesson18.task2

fun main() {
    val squareDice = SquareDice()
    val hexagonalDice = HexagonalDice()
    val octagonalDice = OctagonalDice()

    val diceList = mutableListOf<Dice>()
    diceList.add(squareDice)
    diceList.add(hexagonalDice)
    diceList.add(octagonalDice)

    diceList.forEach { it.diceRoll() }
}

abstract class Dice {
    abstract fun diceRoll()
}

class SquareDice : Dice() {
    override fun diceRoll() {
        println((1 .. 4).random())
    }
}

class HexagonalDice : Dice() {
    override fun diceRoll() {
        println((1 .. 6).random())
    }
}

class OctagonalDice : Dice() {
    override fun diceRoll() {
        println((1 .. 8).random())
    }
}