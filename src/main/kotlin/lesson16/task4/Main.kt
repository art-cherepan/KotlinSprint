package lesson16.task4

fun main() {
    val order = Order(
        orderNumber = "sdf2v34fa3c",
        orderStatus = OrderStatus.ISSUED
    )

    println("Статус заказа: ${order.getOrderStatus().name}")
    order.setOrderStatus(OrderStatus.AT_WORK)
    println("Статус заказа: ${order.getOrderStatus().name}")
}

class Order(
    private val orderNumber: String,
    private var orderStatus: OrderStatus,
) {
    public fun getOrderNumber(): String {
        return orderNumber
    }

    public fun getOrderStatus(): OrderStatus {
        return orderStatus
    }

    public fun setOrderStatus(_orderStatus: OrderStatus) {
        orderStatus = _orderStatus
    }
}

enum class OrderStatus(val status: Int) {
    ISSUED(1),
    AT_WORK(2),
    CANCELED(3),
    COMPLETED(4),
}

