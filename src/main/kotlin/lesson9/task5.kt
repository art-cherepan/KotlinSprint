package lesson9

import java.util.*

fun main() {
    println("Введите ингредиенты по очереди:")
    val userIngredients = MutableList<String?>(INGREDIENTS_COUNT) { readln() }

    userIngredients.sortBy { it }

    val userIngredientsToString = userIngredients.toSet().joinToString(separator = ", ")
    val sortedUserIngredientsCapitalize = userIngredientsToString.replaceFirstChar { it.titlecase(Locale.getDefault()) }

    println(sortedUserIngredientsCapitalize)
}

const val INGREDIENTS_COUNT = 5