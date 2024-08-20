package lesson3

fun main() {
    val logStr = "D2-D4;0"

    val logStrToList = logStr.split(";")
    val startFinishField = logStrToList.first()
    val playerMove = logStrToList.last()

    val startField = startFinishField.split("-").first()
    val finishField = startFinishField.split("-").last()

    println("Начальное поле: $startField")
    println("Конечное поле: $finishField")
    println("Ход игрока: $playerMove")
}