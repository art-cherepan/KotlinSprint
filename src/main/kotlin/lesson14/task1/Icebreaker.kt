package lesson14.task1

class Icebreaker(
    speed: Int = 70,
    liftingCapacity: Int = 30,
    passengerCapacity: Int = 300,
) : Liner(
    speed,
    liftingCapacity,
    passengerCapacity,
    toCrashIce = true,
) {
}