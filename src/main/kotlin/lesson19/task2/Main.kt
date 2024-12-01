package lesson19.task2

fun main() {
    val hoodie = Product(
        id = 1,
        name = "Худи",
        category = ProductCategory.CLOTH,
    )

    val penParker = Product(
        id = 2,
        name = "Ручка паркер",
        category = ProductCategory.STATIONERY,
    )

    val electricKettle = Product(
        id = 3,
        name = "Электрический чайник",
        category = ProductCategory.MISCELLANEOUS,
    )

    val products: MutableList<Product> = mutableListOf()

    products.add(hoodie)
    products.add(penParker)
    products.add(electricKettle)

    products.forEach { println(it.getProductInfo()) }
}

class Product(
    private val id: Int,
    private val name: String,
    private val category: ProductCategory
) {
    fun getProductInfo(): String {
        return """
            Название товара: $name
            Категория товара: ${category.getProductDescription()}
        """.trimIndent()
    }
}

enum class ProductCategory {
    CLOTH {
        override fun getProductDescription(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getProductDescription(): String {
            return "Канцелярские товары"
        }
    },
    MISCELLANEOUS {
        override fun getProductDescription(): String {
            return "Разное"
        }
    };

    abstract fun getProductDescription(): String
}