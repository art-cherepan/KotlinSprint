package Lesson6

fun main() {
    println("Введите количество секунд:")
    val countOfSeconds = readln().toInt()

    var counter = countOfSeconds

    while (counter > 0) {
        println("Осталось ${counter--} секунд(ы)")
        Thread.sleep(1000)
    }

    println("Время вышло")
}