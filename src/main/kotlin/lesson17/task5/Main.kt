package lesson17.task5

fun main() {
    val user = User(
        login = "login",
        password = "123222",
    )
    println("Логин: ${user.login}\nПароль: ${user.password}")

    user.login = "newLogin"
    user.password = "123"
    println("Новый логин: ${user.login}\nНовый пароль: ${user.password}")
}

class User(login: String, password: String) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password = password
        get() {
            return "*".repeat(field.length)
        }

        set(value) {
            println("Вы не можете изменить пароль")
        }
}