package lesson20.task5

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier { phrase: String -> phrase.reversed() }
    robot.say()
}

class Robot {
    private val phrases = listOf(
        "Здравствуй лето, зеленое, милое, светлое...",
        "Дети обнимут за шею небо",
        "Взгромоздитесь, грязные, в калошах и без калош",
        "Сверкала с ног до головы",
        "Завоевание врагам",
    )

    private var modifier: ((String) -> String)? = null

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        if (modifier != null) {
            val phrase = phrases[(0..phrases.lastIndex).random()]
            println(modifier?.let { it(phrase) })
        } else println(phrases[(0..phrases.lastIndex).random()])
    }
}