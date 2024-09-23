package lesson10

fun main() {
    var humanWinCounter = 0

    do {
        humanWinCounter += gameRound()

        println("Хотите бросить кости еще раз? (да/нет)")
        val userAnswer = readln()
    } while (userAnswer != "нет")

    println("Человечество выйграло $humanWinCounter раз(а)")
}

fun gameRound(): Int {
    println("Ход игрока:")
    val playerMove = getRandomNumber() //функция getRandomNumber добавлена в lesson10.task1.kt

    println("Игрок выбросил число $playerMove")

    println("Ход компьютера:")
    val computerMove = getRandomNumber()

    println("Компьютер выбросил число $computerMove")

    if (playerMove > computerMove) {
        println("Победило человечество")

        return 1
    } else if (playerMove < computerMove) {
        println("Победила машина")

        return 0
    } else {
        println("Ничья")

        return 0
    }
}