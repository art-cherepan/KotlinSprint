package lesson19.task4

fun main() {
    val tank = Tank()

    tank.setCartridgeType(Cartridge.BLUE)
    tank.shoot()

    tank.setCartridgeType(Cartridge.RED)
    tank.shoot()
}

class Tank (
    private var cartridgeType: Cartridge? = null,
) {
    fun setCartridgeType(cartridge: Cartridge) {
        cartridgeType = cartridge
    }

    fun shoot() {
        println("Нанесенный урон: ${cartridgeType?.damage}")
    }
}

enum class Cartridge(val damage: Int) {
    BLUE(damage = 5),
    GREEN(damage = 10),
    RED(damage = 20),
}