package lesson22.task5

fun main() {
    val alphaCentauri = GalacticGuide(
        placeOrEventName = "Альфа Центавра",
        placeOrEventDescription = "Тройная звёздная система в созвездии Центавра",
        eventDateTime = "3042-02-12 15:30:00",
        distanceToEarth = 4.367,
    )

    val placeOrEventName = alphaCentauri.component1()
    val placeOrEventDescription = alphaCentauri.component2()
    val eventDateTime = alphaCentauri.component3()
    val distanceToEarth = alphaCentauri.component4()

    println("""
        Место: $placeOrEventName
        Описание: $placeOrEventDescription
        Дата: $eventDateTime
        Расстояние от Земли: $distanceToEarth
    """.trimIndent())
}

data class GalacticGuide(
    val placeOrEventName: String,
    val placeOrEventDescription: String,
    val eventDateTime: String,
    val distanceToEarth: Double,
)