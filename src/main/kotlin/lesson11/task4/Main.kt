package lesson11.task4

fun main() {
    val ingredient1 = Ingredient ("Творог", 350, "г.")
    val ingredient2 = Ingredient ("Куриное яйцо", 2, "штуки")
    val ingredient3 = Ingredient ("Пшеничная мука", 6, "ст. ложек")
    val ingredient4 = Ingredient ("Подсолнечное масло", 5, "ст. ложек")
    val ingredient5 = Ingredient ("Сахар", 2, "ст. ложки")

    val recipe = Recipe(
        "Бургер с грибами и сыром",
        mutableListOf(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5),
        "Описываем способ приготовления",
        2,
    )

    val category = Category (
        "Бургеры",
        mutableListOf(recipe),
    )

    println("Категория рецептов: ${category.getName()}")

    println("Список рецептов в категории:")
    category.getRecipes().forEach { println(it.getName()) }

    val userRecipe = category.getRecipes().first()
    println("Рецепт \"${userRecipe.getName()}\" на ${userRecipe.getPortions()} порции(й):")

    userRecipe.getIngredients().forEach {
        println(it.getName() + " " +
                it.getCount() * userRecipe.getPortions() + " " +
                it.getUnitOfMeasurement()) }
    println("Способ приготовления: \n${userRecipe.getCookingMethod()}")
}

class Category (
    private val name: String,
    private val recipes: MutableList<Recipe>,
) {
    fun getName(): String {
        return name
    }

    fun getRecipes(): List<Recipe> {
        return recipes
    }

    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }

    fun removeRecipe(recipe: Recipe) {
        recipes.removeAll { it.getName() == recipe.getName() }
    }
}

class Recipe (
    private val name: String,
    private val ingredients: MutableList<Ingredient>,
    private val cookingMethod: String,
    private val portions: Int,
) {
    fun getName(): String {
        return name
    }

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun removeIngredient(ingredient: Ingredient) {
        ingredients.removeAll { it.getName() == ingredient.getName() }
    }

    fun getIngredients(): List<Ingredient> {
        return ingredients
    }

    fun getCookingMethod(): String {
        return cookingMethod
    }

    fun getPortions(): Int {
        return portions
    }
}

class Ingredient (
    private val name: String,
    private val count: Int,
    private val unitOfMeasurement: String,
) {
    fun getName(): String {
        return name
    }

    fun getCount(): Int {
        return count
    }

    fun getUnitOfMeasurement(): String {
        return unitOfMeasurement
    }
}