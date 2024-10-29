package lesson15.task3

fun main() {
    val forumUser = ForumUser()
    val admin = Admin()

    forumUser.writeMessage()
    forumUser.readForum()
    admin.deleteMessage()
    admin.deleteUser()
}

abstract class User() {
    fun writeMessage() {
        println("Пользователь написал сообщение")
    }

    fun readForum() {
        println("Пользователь прочитал форум")
    }
}

class ForumUser() : User() {}

class Admin() : User() {
    fun deleteUser() {
        println("Администратор удалил пользователя")
    }

    fun deleteMessage() {
        println("Администратор удалил сообщение")
    }
}