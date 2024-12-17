package lesson21.task1

fun main() {
    println("hello".vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (char in this.lowercase()) {
        if (char in vowels) {
            count++
        }
    }

    return count
}
