package lesson19.task5

fun main() {
    val persons: MutableList<Person> = mutableListOf()

    while (true) {
        println("Введите имя:")
        val name = readln()

        println("Введите пол (муж/жен):")
        val genderValue = readln()

        val gender: Gender? = when(genderValue) {
            Gender.MALE.description -> Gender.MALE
            Gender.FEMALE.description -> Gender.FEMALE
            else -> null
        }

        if (gender == null) {
            println("Неверно указан пол")

            continue
        }

        persons.add(
            Person(
                name = name,
                gender = gender,
            )
        )

        if (persons.count() == PERSON_COUNT) break
    }

    persons.forEach { println("имя: ${it.name} пол: ${it.gender.description}") }
}

class Person(
    val name: String,
    val gender: Gender,
)

enum class Gender(val description: String) {
    MALE("муж"),
    FEMALE("жен"),
}

const val PERSON_COUNT = 5