package lesson8

fun main() {
    val days = intArrayOf(20, 32, 12, 32, 54, 13, 21)
    var sum = 0

    for (viewings in days) {
        sum += viewings
    }

    println("Количество просмотров рекламы за неделю: $sum")
}
