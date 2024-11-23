package lesson18.task1

fun main() {
    val order = Order("deq23c")
    order.getProductInfo("MacBook Pro M2")
    order.getProductInfo(listOf("Iphone 11 Pro", "Pixel 6A", "Samsung Galaxy S21"))
}

class Order(
    private val number: String,
) {
    fun getProductInfo(productName: String) {
        println("Заказан товар: $productName")
    }

    fun getProductInfo(productsName: List<String>) {
        var productsInfoText = "Заказаны следующие товары:"
        productsName.forEach { productsInfoText += " $it," }
        productsInfoText = productsInfoText.substring(0, productsInfoText.length - 1)

        println(productsInfoText)
    }
}