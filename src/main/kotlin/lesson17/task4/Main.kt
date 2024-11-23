package lesson17.task4

fun main() {
    val _package = Package(
        location = "Moscow",
        number = "dfew435vfd43",
    )

    _package._location = "Novosibirsk"
    _package._location = "Irkutsk"

    println("Текущее местоположение посылки: ${_package._location}")
    println("Количество перемещений посылки: ${_package.getCounter()}")
}

class Package(
    location: String,
    private val number: String,
) {
    private var counter: Int = 0

    var _location = location
        set(value) {
            counter++
            field = value
        }

    fun getCounter(): Int {
        return counter
    }
}