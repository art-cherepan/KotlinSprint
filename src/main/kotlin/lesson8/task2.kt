package lesson8

fun main() {
    val ingredients = arrayOf(
        "тесто",
        "моцарелла",
        "оливковое масло",
        "сырокопченая колбаса",
        "перец чили",
        "помидоры",
        "орегано",
        "базилик",
        "чеснок",
        "сахар",
        "соль",
        "черный перец",
    )

    println("Введите название ингредиента:")
    val userIngredient = readln()

    for (ingredient in ingredients) {
        if (ingredient == userIngredient) {
            println("Ингредиент $ingredient в рецепте есть")

            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}