package lesson11.task2

fun main() {
    val user = User2 (
        id = 1,
        login = "login",
        password = "password",
        email = "email@mail.com",
    )

    user.changePassword()
    user.setBio()
    user.getInfo()
}

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    private var bio: String = "",
) {
    fun getInfo() {
        val info = """
            id: $id
            login: login
            password: $password
            email: $email
            bio: $bio
    """.trimIndent()

        println("Информация о пользователе: \n$info")
    }

    fun setBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln()

        if (currentPassword != password) {
            println("Пароли не совпадают")

            return
        }

        println("Введите новый пароль:")
        password = readln()
        println("Пароль изменен")
    }
}