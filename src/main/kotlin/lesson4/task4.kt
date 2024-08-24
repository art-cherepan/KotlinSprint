package lesson4

fun main() {
    try {
        println("Введите номер дня тренировки:")
        val numberOfTrainingDay = readln().toInt()
        val programOfTraining = getProgramOfTraining(numberOfTrainingDay)

        println("""
        Упражнения для рук:    ${programOfTraining["exercisesForHands"]}
        Упражнения для ног:    ${programOfTraining["exercisesForLegs"]}
        Упражнения для спины:  ${programOfTraining["exercisesForRear"]}
        Упражнения для пресса: ${programOfTraining["exercisesForAbdominal"]}
    """.trimIndent())
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

fun getProgramOfTraining(numberOfTrainingDay: Int): Map<String, Boolean> {
    if (numberOfTrainingDay < MINIMAL_NUMBER_OF_TRAINING_DAY) {
        throw IllegalArgumentException("Number of training day must not be less than one.")
    }

    val honestTrainingDay = mapOf(
        "exercisesForHands" to true,
        "exercisesForLegs" to false,
        "exercisesForRear" to false,
        "exercisesForAbdominal" to true,
    )

    val oddTrainingDay = mapOf(
        "exercisesForHands" to false,
        "exercisesForLegs" to true,
        "exercisesForRear" to true,
        "exercisesForAbdominal" to false,
    )

    if (numberOfTrainingDay % 2 == 0) return honestTrainingDay

    return oddTrainingDay
}

const val MINIMAL_NUMBER_OF_TRAINING_DAY = 1