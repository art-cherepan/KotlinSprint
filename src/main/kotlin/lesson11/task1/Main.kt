package lesson11.task1

fun main() {
    val user1 = User (
        id = 1,
        login = "login",
        password = "password",
        email = "email@mail.com",
    )

    val user2 = User (
        id = 2,
        login = "login",
        password = "password",
        email = "email",
    )

    val user1Info = """
        id = ${user1.id}
        login = ${user1.login}
        password = ${user1.password}
        email = ${user1.email}
    """.trimIndent()

    println("Информация о первом пользователе: \n$user1Info")

    val user2Info = """
        id = ${user2.id}
        login = ${user2.login}
        password = ${user2.password}
        email = ${user2.email}
    """.trimIndent()

    println("Информация о втором пользователе: \n$user2Info")
}