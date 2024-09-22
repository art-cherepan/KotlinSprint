package lesson9

import java.util.*

fun main() {
    val userIngredients = mutableListOf<String>()
    var counter = COUNT_OF_UNIQUE_INGREDIENTS_START

    while (counter < COUNT_OF_UNIQUE_INGREDIENTS_FINISH) {
        println("Введите ингредиент:")
        val userIngredient = readln()

        if (userIngredient in userIngredients) {
            println("Вы уже вводили такой ингредиент")

            continue
        }

        userIngredients.add(userIngredient)
        ++counter
    }

    val sortedUserIngredients = userIngredients.sorted().joinToString(separator = ", ")
    val sortedUserIngredientsCapitalize = sortedUserIngredients.replaceFirstChar { it.titlecase(Locale.getDefault()) }

    println(sortedUserIngredientsCapitalize)
}

const val COUNT_OF_UNIQUE_INGREDIENTS_START = 0
const val COUNT_OF_UNIQUE_INGREDIENTS_FINISH = 5