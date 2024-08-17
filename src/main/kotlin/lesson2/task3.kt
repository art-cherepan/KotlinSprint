package lesson2

fun main() {
    val trainStartingHour = 9
    val trainStartingMinute = 39
    val trainRoadDurationMinuteCount = 457

    val trainRoadDurationHourCount = trainRoadDurationMinuteCount / 60
    val trainRoadDurationMinuteRemainderCount = trainRoadDurationMinuteCount % 60

    val trainFinishHour =
            trainStartingHour +
            trainRoadDurationHourCount +
            (trainStartingMinute + trainRoadDurationMinuteRemainderCount) / 60
    val trainFinishMinute = (trainStartingMinute + trainRoadDurationMinuteRemainderCount) % 60

    println("Прибытие в $trainFinishHour:$trainFinishMinute")
}