package lesson6

fun main() {
    println("Введите количество секунд:")
    val countOfSeconds = readln().toInt()
    var counter = countOfSeconds

    while (counter > 0) {
        Thread.sleep(MILLISECONDS_COUNT)
        --counter
    }

    println("Прошло $countOfSeconds секунд(ы)")
}

const val MILLISECONDS_COUNT: Long = 1000