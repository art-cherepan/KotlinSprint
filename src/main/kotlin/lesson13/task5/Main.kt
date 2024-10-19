package lesson13.task5

fun main() {
    println("Введите имя:")
    val userName = readln()

    println("Введите номер телефона:")
    val userPhone = try {
        readln().toLong()
    } catch (e: Throwable) {
        println("Возникло исключение: ${e.javaClass}")

        return
    }

    println("Введите название компании:")
    val companyName = readln()

    val phoneBook = PhoneBookTask5(
        name = userName,
        phone = userPhone,
        company = companyName,
    )

    phoneBook.printContactInfo()
}

class PhoneBookTask5(
    private val name: String,
    private val phone: Long,
    private val company: String? = null,
) {
    fun printContactInfo() {
        println(
            """
            - Имя: ${name}
            - Телефон: ${phone}
            - Компания: ${company ?: "<не указано>"}
        """.trimIndent()
        )
    }
}