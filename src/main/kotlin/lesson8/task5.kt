package lesson8

fun main() {
    println("Введите количество ингредиентов:")
    val count = readln().toInt()

    val ingredients = Array(count) {""}

    for (i in 0 until  count) {
        println("Введите ингредиент:")
        val userIngredient = readln()

        ingredients[i] = userIngredient
    }

    ingredients.forEach { println(it) }
}