package lesson15.task5

fun main() {
    val mazda = Car("Mazda 6", 3)
    val bmw = Car("BMW X3", 3)
    val zil = Cargo("ЗИЛ", 1, 3000.0)

    mazda.pickUpPassenger(3)
    bmw.pickUpPassenger(3)
    zil.pickUpCargo(3000.0)

    mazda.startMovement()
    bmw.startMovement()
    zil.startMovement()

    mazda.stopMovement()
    bmw.stopMovement()
    zil.stopMovement()

    mazda.dropOffPassenger(3)
    bmw.dropOffPassenger(3)
    zil.dropOffCargo(3000.0)
}

interface Movable {
    fun startMovement()
    fun stopMovement()
}

interface Transportable {
    fun pickUpPassenger(passengerCount: Int): Boolean
    fun dropOffPassenger(passengerCount: Int): Boolean
}

interface Shippable {
    fun pickUpCargo(cargoMass: Double): Boolean
    fun dropOffCargo(cargoMass: Double): Boolean
}

abstract class Transport(val name: String, private val maxPassengerCount: Int) : Movable, Transportable {
    private var onBoardPassengerCount: Int = 0

    override fun startMovement() {
        println("$name начал движение")
    }

    override fun stopMovement() {
        println("$name закончил движение")
    }

    override fun pickUpPassenger(passengerCount: Int): Boolean {
        if ((onBoardPassengerCount + passengerCount) <= maxPassengerCount) {
            onBoardPassengerCount += passengerCount
            println("$name забрал $passengerCount пассажира(ов)")

            return true
        }

        return false
    }

    override fun dropOffPassenger(passengerCount: Int): Boolean {
        if ((onBoardPassengerCount - passengerCount) >= 0) {
            onBoardPassengerCount -= passengerCount
            println("$name высадил $passengerCount пассажира(ов)")

            return true
        }

        return false
    }
}

class Car(name: String, maxPassengerCount: Int) : Transport(name, maxPassengerCount)

class Cargo(
    name: String,
    maxPassengerCount: Int,
    private val maxCargoMass: Double
) : Transport(
    name,
    maxPassengerCount
), Shippable {
    private var currentCargoMass: Double = 0.0

    override fun pickUpCargo(cargoMass: Double): Boolean {
        if ((currentCargoMass + cargoMass) <= maxCargoMass ) {
            currentCargoMass += cargoMass
            println("$name загрузил $cargoMass тонн груза")

            return true
        }

        return false
    }

    override fun dropOffCargo(cargoMass: Double): Boolean {
        if ((currentCargoMass - cargoMass) >= 0.0) {
            currentCargoMass -= cargoMass
            println("$name разгрузил $cargoMass тонн груза")

            return true
        }

        return false
    }
}