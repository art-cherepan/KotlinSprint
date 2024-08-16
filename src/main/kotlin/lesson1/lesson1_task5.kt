package lesson1

fun main() {
    val secondsPerHour = 3600
    val minutesPerHour = 60
    val seconds = 6480
    val hours = seconds / secondsPerHour
    val minutes = (seconds % secondsPerHour) / minutesPerHour
    val secondRemainder = seconds % minutesPerHour

    var strResult = ""

    if (hours < 10) {
        strResult += "0$hours:"
    } else {
        strResult += "$hours:"
    }

    if (minutes < 10) {
        strResult += "0$minutes:"
    } else {
        strResult += "$minutes:"
    }

    if (secondRemainder < 10) {
        strResult += "0$secondRemainder"
    } else {
        strResult += "$secondRemainder"
    }

    print(strResult)
}