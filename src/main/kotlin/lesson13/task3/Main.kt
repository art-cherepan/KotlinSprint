package lesson13.task3

fun main() {
    val contactList: MutableList<PhoneBookTask3> = mutableListOf()
    val companyList: MutableList<String> = mutableListOf()

    contactList.add(
        PhoneBookTask3(
            name = "Alex",
            phone = 89123456781,
        )
    )

    contactList.add(
        PhoneBookTask3(
            name = "John",
            phone = 89123456782,
        )
    )

    contactList.add(
        PhoneBookTask3(
            name = "Kris",
            phone = 89123456783,
            company = "null",
        )
    )

    contactList.add(
        PhoneBookTask3(
            name = "Kate",
            phone = 89123456784,
            company = "KFC",
        )
    )

    contactList.add(
        PhoneBookTask3(
            name = "Vicky",
            phone = 89123456785,
            company = "Adidas",
        )
    )

    contactList.forEach {
        if (it.getCompany() != null) {          //наверное, есть более "элегантное" решение
            companyList.add(it.getCompany()!!)
        }
    }

    companyList.forEach { println(it) }
}

class PhoneBookTask3(
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
        println(
            """
            - Имя: ${getName()}
            - Телефон: ${getPhone()}
            - Компания: ${getCompany() ?: "<не указано>"}
        """.trimIndent()
        )
    }
}