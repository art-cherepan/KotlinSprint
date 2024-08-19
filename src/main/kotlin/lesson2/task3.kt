package lesson2

fun main() {
    val trainStartingHour = 9
    val trainStartingMinute = 39
    val trainRoadDurationMinuteCount = 457
    val minutesPerHour = 60

    val trainRoadDurationHourCount = trainRoadDurationMinuteCount / minutesPerHour
    val trainRoadDurationMinuteRemainderCount = trainRoadDurationMinuteCount % minutesPerHour

    val trainFinishHour =
            trainStartingHour +
            trainRoadDurationHourCount +
            (trainStartingMinute + trainRoadDurationMinuteRemainderCount) / minutesPerHour
    val trainFinishMinute = (trainStartingMinute + trainRoadDurationMinuteRemainderCount) % minutesPerHour

    println("Прибытие в $trainFinishHour:$trainFinishMinute")
}