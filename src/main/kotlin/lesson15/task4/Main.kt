package lesson15.task4

fun main() {
    val capo = Accessories(
        id = 1,
        name = "Кападастр",
        countryOfOrigin = "Индонезия",
        price = 500.0,
        quantityInStock = 1000,
        instrumentId = 1,
    )

    val strings = Accessories(
        id = 2,
        name = "Струны для гитары",
        countryOfOrigin = "США",
        price = 1500.0,
        quantityInStock = 2000,
        instrumentId = 1,
    )

    val guitar = Instrument(
        id = 1,
        name = "Гитара",
        countryOfOrigin = "США",
        price = 25000.0,
        quantityInStock = 300,
        type = "Струнные инструменты",
    )

    guitar.findAccessories()
}

abstract class Product {
    abstract val id: Int
    abstract val name: String
    abstract val countryOfOrigin: String
    abstract val price: Double
    abstract val quantityInStock: Int
}

class Accessories(
    override val id: Int,
    override val name: String,
    override val countryOfOrigin: String,
    override val price: Double,
    override val quantityInStock: Int,
    val instrumentId: Int,
    ) : Product()

class Instrument(
    override val id: Int,
    override val name: String,
    override val countryOfOrigin: String,
    override val price: Double,
    override val quantityInStock: Int,
    val type: String,
) : Product(), Findable {
    override fun findAccessories() {
        println("Выполняется поиск")
    }
}

interface Findable {
    fun findAccessories()
}