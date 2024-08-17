package lesson2

fun main() {
    val firstStudentPoint = 3f
    val secondStudentPoint = 4f
    val thirdStudentPoint = 3f
    val fourthStudentPoint = 5f

    val arithmeticMean = (firstStudentPoint + secondStudentPoint + thirdStudentPoint + fourthStudentPoint) / 4

    println(String.format("%.2f", arithmeticMean))
}