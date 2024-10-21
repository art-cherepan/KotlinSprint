package lesson14.task1

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