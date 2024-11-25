package lesson18.task3

fun main() {
    val tamagotchies = mutableListOf<Tamagotchi>()

    val fox = Fox()
    val cat = Cat()
    val dog = Dog()

    tamagotchies.add(fox)
    tamagotchies.add(cat)
    tamagotchies.add(dog)

    tamagotchies.forEach { it.meal() }
}

abstract class Tamagotchi(private val name: String, private val foodName: String) {
    fun getName(): String {
        return name
    }

    fun meal() {
        println("${getName()} -> ест $foodName")
    }
}

class Fox : Tamagotchi(name = "Лиса", foodName = "ягоды")
class Cat : Tamagotchi(name = "Кошка", foodName = "рыбу")
class Dog : Tamagotchi(name = "Собака", foodName = "кость")