package lesson9

fun main() {
    val ingredients = mutableListOf(
        "тесто",
        "моцарелла",
        "оливковое масло",
    )

    println("В рецепте есть базовые ингредиенты:")

    ingredients.forEach { ingredient -> println(ingredient) }

    do {
        println("Желаете добавить еще ? (да/нет)")
        val userChoose = readln()

        if (userChoose == "да") {
            println("Какой ингредиент вы хотите добавить?")
            val newIngredient = readln()

            ingredients.add(newIngredient)
        }

    } while (userChoose != "нет")

    println("Теперь в рецепте есть следующие ингредиенты:")
    ingredients.forEach{ ingredient -> println(ingredient) }
}