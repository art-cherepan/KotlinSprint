package lesson5

import java.util.Calendar

fun main() {
    println("Введите ваш год рождения:")

    val yearOfBirth = readln().toInt()
    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)

    if (currentYear - yearOfBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом.")
    } else {
        println("Показ скрытого контента запрещен.")
    }
}

const val AGE_OF_MAJORITY = 18