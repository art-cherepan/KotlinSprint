package Lesson6

fun main() {
    println("Введите количество секунд:")
    val countOfSeconds = readln().toInt()
    var counter = countOfSeconds

    while (counter > 0) {
        Thread.sleep(COUNT_OF_MILLISECONDS)
        --counter
    }

    println("Прошло $countOfSeconds секунд(ы)")
}

const val COUNT_OF_MILLISECONDS: Long = 1000