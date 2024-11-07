package lesson15.task5

fun main() {
    val mazda = Car("Mazda 6")
    val bmw = Car("BMW X3")
    val zil = Cargo("ЗИЛ")

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

interface PassengersTransportation {
    val maxPassengerCount: Int
    var onBoardPassengerCount: Int

    fun pickUpPassenger(passengerCount: Int): Boolean
    fun dropOffPassenger(passengerCount: Int): Boolean
}

interface CargoTransportation {
    val maxCargoMass: Double
    var currentCargoMass: Double

    fun pickUpCargo(cargoMass: Double): Boolean
    fun dropOffCargo(cargoMass: Double): Boolean
}

abstract class Transport(val name: String) : Movable, PassengersTransportation {
    override fun startMovement() {
        println("$name начал движение")
    }

    override fun stopMovement() {
        println("$name закончил движение")
    }

    override fun pickUpPassenger(passengerCount: Int): Boolean {
        if ((onBoardPassengerCount + passengerCount) <= maxPassengerCount) {
            onBoardPassengerCount += passengerCount

            return true
        }

        return false
    }

    override fun dropOffPassenger(passengerCount: Int): Boolean {
        if ((onBoardPassengerCount - passengerCount) >= 0) {
            onBoardPassengerCount -= passengerCount

            return true
        }

        return false
    }
}

class Car(name: String) : Transport(name = name) {
    override val maxPassengerCount = 3
    override var onBoardPassengerCount = 0
}

class Cargo(name: String) : Transport(name = name), CargoTransportation {
    override val maxPassengerCount = 1
    override var onBoardPassengerCount = 0
    override val maxCargoMass = 3000.0
    override var currentCargoMass = 0.0

    override fun pickUpCargo(cargoMass: Double): Boolean {
        if ((currentCargoMass + cargoMass) <= maxCargoMass ) {
            currentCargoMass += cargoMass

            return true
        }

        return false
    }

    override fun dropOffCargo(cargoMass: Double): Boolean {
        if ((currentCargoMass - cargoMass) >= 0.0) {
            currentCargoMass -= cargoMass

            return true
        }

        return false
    }
}