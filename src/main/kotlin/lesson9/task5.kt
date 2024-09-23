package lesson9

import java.util.*

fun main() {
    val userIngredients = mutableSetOf<String>()

    while (userIngredients.size < COUNT_OF_UNIQUE_INGREDIENTS) {
        println("Введите ингредиент:")
        val userIngredient = readln()

        userIngredients.add(userIngredient)
    }

    val sortedUserIngredients = userIngredients.sorted().joinToString(separator = ", ")
    val sortedUserIngredientsCapitalize = sortedUserIngredients.replaceFirstChar { it.titlecase(Locale.getDefault()) }

    println(sortedUserIngredientsCapitalize)
}

const val COUNT_OF_UNIQUE_INGREDIENTS = 5