package Lesson6

fun main() {
    println("Введите количество секунд:")
    val countOfSeconds = readln().toInt()
    var counter = countOfSeconds

    while (counter > 0) {
        Thread.sleep(1000)
        --counter
    }

    println("Прошло $countOfSeconds секунд(ы)")
}