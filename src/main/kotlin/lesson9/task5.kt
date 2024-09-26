package lesson9

fun main() {
    println("Введите ингредиенты по очереди:")
    val userIngredients = MutableList(INGREDIENTS_COUNT) { readln() }

    userIngredients.sortBy { it }

    val userIngredientsToString = userIngredients.toSet().joinToString(separator = ", ")
    val sortedUserIngredientsCapitalize = userIngredientsToString.replaceFirstChar { it.uppercase() }

    println(sortedUserIngredientsCapitalize)
}

const val INGREDIENTS_COUNT = 5