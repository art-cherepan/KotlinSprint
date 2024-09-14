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

    if (userIngredient in ingredients) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}