package lesson22.task3

fun main() {
    val someDataClass = SomeDataClass(
        field1 = "Строка",
        field2 = 10,
        field3 = true,
    )

    val (field1, field2, field3) = someDataClass

    println(field1)
    println(field2)
    println(field3)
}

data class SomeDataClass(
    val field1: String,
    val field2: Int,
    val field3: Boolean,
)