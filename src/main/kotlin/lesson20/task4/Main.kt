package lesson20.task4

fun main() {
    val list = listOf("строка 0","строка 1","строка 2")

    val listMap = list.map { {println("Нажат элемент $it")} }

    listMap.forEachIndexed { index, function -> if (index % 2 == 0) function() }
}