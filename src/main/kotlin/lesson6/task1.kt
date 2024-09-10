package lesson6

fun main() {
    println("Введите ваш логин:")
    val login  = readln()

    println("Введите пароль:")
    val password  = readln()

    do {
        println("Введите логин:")
        val enterLogin = readln()

        println("Введите пароль:")
        val enterPassword = readln()
    } while (enterLogin != login && enterPassword != password)

    println("Авторизация прошла успешно")
}