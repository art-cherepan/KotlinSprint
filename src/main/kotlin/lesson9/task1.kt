package lesson9

fun main() {
    val ingredients = listOf(
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

    println("В рецепте есть следующие ингредиенты:")

    ingredients.forEach { ingredient -> println(ingredient) }
}