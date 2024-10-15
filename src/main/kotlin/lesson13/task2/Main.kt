package lesson13.task2

fun main() {
    val contact1 = PhoneBookTask2(
        name = "Alex",
        phone = 89123456789,
        company = "DNS",
    )

    val contact2 = PhoneBookTask2(
        name = "John",
        phone = 89123456788,
    )

    contact1.printContactInfo()
    contact2.printContactInfo()
}

class PhoneBookTask2(
    private val name: String,
    private val phone: Long,
    private val company: String? = null,
) {
    fun getName(): String {
        return name
    }

    fun getPhone(): Long {
        return phone
    }

    fun getCompany(): String? {
        return company
    }

    fun printContactInfo() {
        println("""
            - Имя: ${getName()}
            - Телефон: ${getPhone()}
            - Компания: ${getCompany() ?: "<не указано>"}
        """.trimIndent())
    }
}