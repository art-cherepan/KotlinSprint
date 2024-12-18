package lesson21.task1.task5

fun main() {
    val map = mapOf("сила" to 10, "выносливость" to 8, "знания" to 9, "магия" to 4)
    println(map.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return this.maxBy { it.value }.key
}