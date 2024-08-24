package lesson5

fun main() {
    println("Введите ваш логин:")
    val userLogin = readln()

    if (LOGIN_PASSWORDS.containsKey(userLogin)) {
        println("Пользователь найден! Введите пароль:")
        val userPass = readln()

        if (LOGIN_PASSWORDS[userLogin] == userPass) {
            println("Добро пожаловать на борт!")
        } else {
            println("Пароль неверный.")
        }
    } else {
        println("Пользователь не найден. Пожалуйста, зарегистрируйтесь.")
    }
}

val LOGIN_PASSWORDS = mapOf(
    "Zaphod" to "PanGalactic",
    "Droid" to "qwer123",
    "Djambo" to "kokoko222",
)
