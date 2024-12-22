package lesson22.task1

fun main() {
    val regularBook1 = RegularBook(
        name = "Война и Мир",
        author = "Лев Толстой",
    )

    val regularBook2 = RegularBook(
        name = "Война и Мир",
        author = "Лев Толстой",
    )

    val dataBook1 = DataBook(
        name = "Мастер и Маргарита",
        author = "Михаил Булгаков",
    )

    val dataBook2 = DataBook(
        name = "Мастер и Маргарита",
        author = "Михаил Булгаков",
    )

    println(regularBook1 == regularBook2) //сравниваются ссылки на объекты
    println(dataBook1 == dataBook2) //сравнивается содержимое свойств объектов
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)