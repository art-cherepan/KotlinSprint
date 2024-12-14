package lesson20.task1

fun main() {
    val splashScreen = { username: String -> "С наступающим Новым Годом, $username!" }

    println(splashScreen("Андрей"))
}