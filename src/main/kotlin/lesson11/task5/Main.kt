package lesson11.task5

fun main() {
    val forum = Forum()

    forum.createNewUser("John")
    forum.createNewUser("Ann")
    forum.createNewMessage("Hi, Ann!", 1)
    forum.createNewMessage("What do you think about Kotlin ?", 1)
    forum.createNewMessage("Hi, John!", 2)
    forum.createNewMessage("I think it's a cool language!", 2)

    forum.printThread()
}

class Forum {
    private val forumUsers: MutableList<ForumUser> = mutableListOf()
    private val forumMessages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String): ForumUser {
        if (forumUsers.isEmpty()) {
            forumUsers.add(ForumUser(START_USER_ID, userName))
        } else {
            forumUsers.add(ForumUser(forumUsers.last().getUserId() + 1, userName))
        }

        return forumUsers.last()
    }

    fun createNewMessage(userMessage: String, userId: Int): ForumMessage? {
        val user: ForumUser? = forumUsers.find { it.getUserId() == userId }

        if (user == null) {
            return null
        }

        forumMessages.add(ForumMessage(userId, userMessage))

        return forumMessages.last()
    }

    fun printThread() {
        forumMessages.forEach { forumMessage ->
            run {
                val forumUser = forumUsers.find { forumMessage.getUserId() == it.getUserId() }

                if (forumUser != null) {
                    println("Автор: ${forumUser.getUserName()} Сообщение: ${forumMessage.getMessage()}")
                }
            }
        }
    }
}

class ForumUser (
    private val userId: Int,
    private val userName: String,
) {
    fun getUserId(): Int {
        return userId
    }

    fun getUserName(): String {
        return userName
    }
}

class ForumMessage (
    private val userId: Int,
    private val message: String,
) {
    fun getUserId(): Int {
        return userId
    }

    fun getMessage(): String {
        return message
    }
}

const val START_USER_ID = 1