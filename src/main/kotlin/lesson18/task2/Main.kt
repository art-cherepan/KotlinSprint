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

abstract class Dice(private val numberOfSides: Int) {
    fun diceRoll() {
        println((1..numberOfSides).random())
    }
}

class SquareDice : Dice(numberOfSides = 4)

class HexagonalDice : Dice(numberOfSides = 6)

class OctagonalDice : Dice(numberOfSides = 8)