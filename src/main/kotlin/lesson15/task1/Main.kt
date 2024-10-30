package lesson15.task1

fun main() {
    val crucianCarp = CrucianCarp()
    val gull = Gull()
    val duck = Duck()

    crucianCarp.swim()
    gull.fly()
    duck.swim()
    duck.fly()
}

interface Flyable {
    fun fly()
}

interface Swimable {
    fun swim()
}

class CrucianCarp() : Swimable {
    override fun swim() {
        println("Карась плавает")
    }
}

class Gull() : Flyable {
    override fun fly(){
        println("Чайка летает")
    }
}

class Duck() : Flyable, Swimable {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}