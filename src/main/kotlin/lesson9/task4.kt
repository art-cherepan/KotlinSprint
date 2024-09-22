package lesson9

fun main() {
    println("Введите 5 названий ингредиентов:")
    val userIngredients = readln().split(", ").sorted()

    println(userIngredients)
}