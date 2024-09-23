package lesson10

fun main() {
    println("Ход игрока:")
    val playerMove = getRandomNumber()

    println("Игрок выбросил числа $playerMove")

    println("Ход компьютера:")
    val computerMove = getRandomNumber()

    println("Компьютер выбросил числа $computerMove")

    if (playerMove > computerMove) {
        println("Победило человечество")
    } else if (playerMove < computerMove) {
        println("Победила машина")
    } else {
        println("Ничья")
    }
}

fun getRandomNumber(): Int = (1 .. 6).random()