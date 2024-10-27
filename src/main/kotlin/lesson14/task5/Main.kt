package lesson14.task5

fun main() {
    val John = Author(
        id = 1,
        name = "John",
    )

    val Maggy = Author(
        id = 2,
        name = "Maggy",
    )

    val Vicky = Author(
        id = 3,
        name = "Vicky",
    )

    val chat = Chat()

    chat.addMessage(
        Message(
            id = 1,
            author = John,
            text = "Hi, all! Do you think Kotlin is a difficult language?"
        )
    )

    chat.addThreadMessage(
        ChildMessage(
            id = 1,
            author = Vicky,
            text = "Hi, bro! I think the barrier to entry is quite high for beginners",
            parentMessageId = 1,
        )
    )

    chat.addThreadMessage(
        ChildMessage(
            id = 2,
            author = Maggy,
            text = "Hello! I agree with Vicky. But I think if you have experience in another language, it will be easier",
            parentMessageId = 1,
        )
    )
    chat.addMessage(
        Message(
            id = 2,
            author = Vicky,
            text = "What do you think about Java?",
        )
    )
    chat.addThreadMessage(
        ChildMessage(
            id = 3,
            author = Maggy,
            text = "I think it's even more difficult than Kotlin",
            parentMessageId = 2,
        )
    )
    chat.addThreadMessage(
        ChildMessage(
            id = 4,
            author = John,
            text = "I agree with Maggy",
            parentMessageId = 2,
        )
    )
    chat.printChat()
}

class Author(
    private val id: Int,
    private val name: String,
) {
    fun getId(): Int {
        return id
    }

    fun getName(): String {
        return name
    }
}

open class Message(
    private val id: Int,
    private val author: Author,
    private val text: String,
) {
    fun getId(): Int {
        return id
    }

    fun getAuthor(): Author {
        return author
    }

    fun getText(): String {
        return text
    }
}

class ChildMessage(
    private val parentMessageId: Int,
    id: Int,
    author: Author,
    text: String,
) : Message(
    id = id,
    author = author,
    text = text,
) {
    fun getParentMessageId(): Int {
        return parentMessageId
    }
}

class Chat(
    private val messageList: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(message: Message) {
        messageList.add(message)
    }

    fun addThreadMessage(childMessage: ChildMessage) {
        messageList.add(childMessage)
    }

    fun getMessageList(): List<Message> {
        return messageList
    }

    fun printChat() {
        val messageMap: Map<Int, List<Message>> =
            messageList.groupBy {
                if (it is ChildMessage) it.getParentMessageId()
                else it.getId()
            }

        messageMap.forEach { entry ->
            entry.value.forEach {
                if (it is ChildMessage) {
                    println("   ${it.getAuthor().getName()}: ${it.getText()}")
                } else {
                    println("${it.getAuthor().getName()}: ${it.getText()}")
                }
            }
        }
    }
}
