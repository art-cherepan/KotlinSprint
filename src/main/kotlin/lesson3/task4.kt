package lesson3

fun main() {
    var numericFieldFrom = 2
    var letterFieldFrom = "E"
    var numericFieldTo = 4
    var letterFieldTo = "E"
    var moveNumber = 0

    println("${letterFieldFrom + numericFieldFrom}-${letterFieldTo + numericFieldTo};$moveNumber")

    letterFieldFrom = "D"
    letterFieldTo = "D"
    numericFieldTo = numericFieldFrom + 1
    moveNumber++

    println("${letterFieldFrom + numericFieldFrom}-${letterFieldTo + numericFieldTo};$moveNumber")
}