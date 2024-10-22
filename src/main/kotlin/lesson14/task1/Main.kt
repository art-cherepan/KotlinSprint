package lesson14.task1

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()
}

open class Liner (
    val speed: Int = 100,
    val liftingCapacity: Int = 20,
    val passengerCapacity: Int = 1000,
    val toCrashIce: Boolean = false,
) {
}

class Cargo(
    speed: Int = 80,
    liftingCapacity: Int = 50,
    passengerCapacity: Int = 700,
): Liner(
    speed,
    liftingCapacity,
    passengerCapacity,
) {
}

class Icebreaker(
    speed: Int = 70,
    liftingCapacity: Int = 30,
    passengerCapacity: Int = 300,
    toCrashIce: Boolean = true,
) : Liner(
    speed,
    liftingCapacity,
    passengerCapacity,
    toCrashIce,
) {
}