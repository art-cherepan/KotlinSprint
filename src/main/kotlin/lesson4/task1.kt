package lesson4

fun main() {
    val todayNumberOfReservationTables = 13
    val tomorrowNumberOfReservationTables = 9

    println("Доступность столиков на сегодня: ${todayNumberOfReservationTables != numberOfTables}")
    println("Доступность столиков на завтра: ${tomorrowNumberOfReservationTables != numberOfTables}")
}

const val NUMBER_OF_TABLES = 13