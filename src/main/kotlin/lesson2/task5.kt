package lesson2

import kotlin.math.pow

fun main () {
    val startCapital = 70_000
    val annualInterestRate = 16.7
    val depositTerm = 20
    val totalAmount = calculateTotalAmount(startCapital, annualInterestRate, depositTerm)

    println("Итоговая сумма: %.3f".format(totalAmount))
}

fun calculateTotalAmount(startCapital: Int, annualInterestRate: Double, depositTerm: Int): Double {
    return startCapital * (1 + annualInterestRate / 100).pow(depositTerm)
}