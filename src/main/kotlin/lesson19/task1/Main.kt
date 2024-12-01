package lesson19.task1

fun main() {
    println("В свой аквариум вы можете добавит следующих рыб:")

    for (fish in FishTypes.entries) {
        println(fish.getName())
    }
}

enum class FishTypes {
    GUPPY {
        override fun getName(): String {
            return "Гуппи"
        }
    },
    ANGELFISH {
        override fun getName(): String {
            return "Скалярия"
        }
    },
    GOLDFISH {
        override fun getName(): String {
            return "Золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH {
        override fun getName(): String {
            return "Петушок"
        }
    };

    abstract fun getName(): String
}