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

        if (userChoose.equals(POSITIVE_USER_ANSWER, true)) {
            println("Какой ингредиент вы хотите добавить?")
            val newIngredient = readln()

            ingredients.add(newIngredient)
        }

    } while (!userChoose.equals(NEGATIVE_USER_ANSWER, true))

    println("Теперь в рецепте есть следующие ингредиенты:")
    ingredients.forEach{ ingredient -> println(ingredient) }
}

const val POSITIVE_USER_ANSWER = "да"
const val NEGATIVE_USER_ANSWER = "нет"