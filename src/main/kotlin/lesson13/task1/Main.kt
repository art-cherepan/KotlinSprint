package lesson13.task1

fun main() {
}

class PhoneBookTask1(
    private val name: String,
    private val phone: Long,
    private val company: String?,
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
}