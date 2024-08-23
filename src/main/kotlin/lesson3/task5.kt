package lesson3

fun main() {
    val logStr = "D2-D4;0"
    val logStrToList = logStr.split("-",";")

    println("Начальное поле: ${logStrToList[0]}")
    println("Конечное поле: ${logStrToList[1]}")
    println("Ход игрока: ${logStrToList[2]}")
}