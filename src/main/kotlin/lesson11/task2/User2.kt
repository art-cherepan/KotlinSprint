package lesson11.task2

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