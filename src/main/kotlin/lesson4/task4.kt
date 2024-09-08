package lesson4

fun main() {
    println("Введите номер дня тренировки:")

    val numberOfTrainingDay = readln().toInt()
    val isHonestTrainingDay = (numberOfTrainingDay % 2 == 0)

    println("""
    Упражнения для рук:    $isHonestTrainingDay
    Упражнения для ног:    ${!isHonestTrainingDay}
    Упражнения для спины:  ${!isHonestTrainingDay}
    Упражнения для пресса: $isHonestTrainingDay
""".trimIndent())
}