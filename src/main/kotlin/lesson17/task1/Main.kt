package lesson17.task1

class Quiz(
    question: String,
    answer: String,
) {
    var question = question
        get() = field
    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}