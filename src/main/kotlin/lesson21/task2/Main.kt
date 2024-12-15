package lesson21.task2

fun main() {
    val numbers = listOf(1, 3, 9, 16, 25, 36)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var count = 0

    for (number in this) {
        if (number % 2 == 0) {
            count+= number
        }
    }

    return count
}