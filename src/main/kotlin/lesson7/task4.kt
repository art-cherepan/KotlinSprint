package lesson7

fun main() {
    println("Введите количество секунд:")
    val countOfSeconds = readln().toInt()

    for (counter in countOfSeconds downTo  TIMER_FINISH_VALUE) {
        println("Осталось: $counter секунд(ы)")
        Thread.sleep(MILLISECONDS_COUNT)
    }

    println("Время вышло")
}

const val MILLISECONDS_COUNT: Long = 1000
const val TIMER_FINISH_VALUE = 1