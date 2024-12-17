package lesson21.task2

fun main() {
    val numbers = listOf(1, 3, 9, 16, 25, 36)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return (this.filter { it % 2 == 0 }).sum()
}