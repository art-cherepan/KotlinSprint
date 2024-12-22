package lesson22.task2

fun main() {
    val regularBookTask2 = RegularBookTask2(
        name = "Три мушкетера",
        author = "А. Дюма",
    )

    val dataBookTask2 = DataBookTask2(
        name = "Преступление и наказание",
        author = "Фёдор Достоевский",
    )

    println(regularBookTask2) // выводится название класса + хэш-код класса
    println(dataBookTask2) // сработает метод toString() data-класса
}

class RegularBookTask2(
    val name: String,
    val author: String,
)

data class DataBookTask2(
    val name: String,
    val author: String,
)