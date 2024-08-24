package lesson4

fun main() {
    val todayNumberOfReservationTables = 13
    val tomorrowNumberOfReservationTables = 9

    println("Доступность столиков на сегодня: ${todayNumberOfReservationTables < NUMBER_OF_TABLES}")
    println("Доступность столиков на завтра: ${tomorrowNumberOfReservationTables < NUMBER_OF_TABLES}")
}

const val NUMBER_OF_TABLES = 13