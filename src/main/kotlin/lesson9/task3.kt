package lesson9

fun main() {
    val ingredients = listOf(2,50,15)

    println("Введите количество порций:")
    val portionCount = readln().toInt()

    val ingredientsByPortionCount = ingredients.map { it * portionCount }

    println(
        "На $portionCount порций вам понадобится: Яиц – ${ingredientsByPortionCount[0]}, молока – " +
        "${ingredientsByPortionCount[1]}, сливочного масла – ${ingredientsByPortionCount[2]}"
    )
}