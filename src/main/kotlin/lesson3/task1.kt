package lesson3

fun main() {
    val userName = "John Doe"
    val dayGreeting = "Добрый день"
    val eveningGreeting = "Добрый вечер"

    var displayGreeting = "$dayGreeting, $userName"
    println(displayGreeting)

    displayGreeting = "$eveningGreeting, $userName"
    println(displayGreeting)
}