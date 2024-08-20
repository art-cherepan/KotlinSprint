package lesson3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20
    var familyName = "Андреева"

    println("ФИО: $familyName $name $patronymic Возраст: $age")

    familyName = "Сидорова"
    age = 22

    println("ФИО: $familyName $name $patronymic Возраст: $age")
}