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
        author = John,
        text = "Hi, all! Do you think Kotlin is a difficult language?",
    )

    var lastParenMessageId: Int = chat.getLastMessageId()

    chat.addThreadMessage(
        author = Vicky,
        text = "Hi, bro! I think the barrier to entry is quite high for beginners",
        parentMessageId = lastParenMessageId,
    )

    chat.addThreadMessage(
        author = Maggy,
        text = "Hello! I agree with Vicky. But I think if you have experience in another language, it will be easier",
        parentMessageId = lastParenMessageId,
    )

    chat.addMessage(
        author = Vicky,
        text = "What do you think about Java?",
    )

    lastParenMessageId = chat.getLastMessageId()

    chat.addThreadMessage(
        author = Maggy,
        text = "I think it's even more difficult than Kotlin",
        parentMessageId = lastParenMessageId,
    )

    chat.addThreadMessage(
        author = John,
        text = "I agree with Maggy",
        parentMessageId = lastParenMessageId,
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
    private var lastMessageId: Int = 0,
) {
    fun addMessage(
        text: String,
        author: Author,
    ) {
        messageList.add(
            Message(
                id = ++lastMessageId,
                text = text,
                author = author,
            )
        )
    }

    fun addThreadMessage(
        text: String,
        author: Author,
        parentMessageId: Int,
    ) {
        messageList.add(
            ChildMessage(
                id = ++lastMessageId,
                text = text,
                author = author,
                parentMessageId = parentMessageId,
            )
        )
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

    fun getLastMessageId(): Int {
        return lastMessageId
    }
}
