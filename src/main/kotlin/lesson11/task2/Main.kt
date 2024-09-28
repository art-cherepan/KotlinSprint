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