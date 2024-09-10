package lesson6

fun main() {
    println("Введите количество секунд:")
    val countOfSeconds = readln().toInt()

    var counter = countOfSeconds

    while (counter > 0) {
        println("Осталось ${counter--} секунд(ы)")
        Thread.sleep(COUNT_OF_MILLISECONDS)
    }

    println("Время вышло")
}

const val COUNT_OF_MILLISECONDS: Long = 1000