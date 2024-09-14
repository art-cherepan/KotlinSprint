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

    println("Текущий список ингредиентов:")

    for (ingredient in ingredients) {
        println(ingredient)
    }

    println("Введите ингредиент:")
    val userIngredient = readln()

    if (userIngredient !in ingredients) {
        println("Ингредиента $userIngredient нет в списке")

        return
    }

    println("Введите ингредиент, на который нужно заменить:")
    val swapIngredient = readln()

    ingredients[ingredients.indexOf(userIngredient)] = swapIngredient

    println("Обновленный список ингредиентов:")

    for (ingredient in ingredients) {
        println(ingredient)
    }
}
