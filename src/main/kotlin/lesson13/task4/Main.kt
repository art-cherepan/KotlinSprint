package lesson13.task4

fun main() {
    var userAnswer: String
    val contactList: MutableList<PhoneBookTask4> = mutableListOf()

    do {
        println("Добавить новый контакт (да/нет) ?")
        userAnswer = readln()

        if (userAnswer.lowercase() == "нет") {
            break
        }

        println("Введите имя:")
        val userName = readln()

        println("Введите номер телефона:")
        val userPhone = readln().toLongOrNull()

        println("Введите название компании:")
        var companyName: String? = readln()

        if (companyName.isNullOrBlank()) {
            companyName = null
        }

        if (userPhone != null) {
            contactList.add(
                PhoneBookTask4(
                    name = userName,
                    phone = userPhone,
                    company = companyName,
                ),
            )
        } else {
            println("Был введен некорректный номер телефона, либо не был введен вообще.")
        }
    } while (true)

    contactList.forEach { it.printContactInfo() }
}

class PhoneBookTask4(
    private val name: String,
    private val phone: Long,
    private val company: String? = null,
) {
    fun printContactInfo() {
        println(
            """
            - Имя: $name
            - Телефон: $phone
            - Компания: ${company ?: "<не указано>"}
        """.trimIndent()
        )
    }
}