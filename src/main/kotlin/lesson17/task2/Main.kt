package lesson17.task2

fun main() {
    var ship = Ship("Ivy", 29.7, "Sirius")
    ship.name = "L1C5"
}

class Ship(
    name: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name = name
        set(value) {
            println("Изменять название корабля запрещено!")
        }
}