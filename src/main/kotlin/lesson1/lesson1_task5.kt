package lesson1

fun main() {
    val secondsPerHour = 3600
    val minutesPerHour = 60
    val seconds = 6480
    val hours = seconds / secondsPerHour
    val minutes = (seconds % secondsPerHour) / minutesPerHour
    val secondRemainder = seconds % minutesPerHour

    println(String.format("%02d:%02d:%02d", hours, minutes, secondRemainder))
}