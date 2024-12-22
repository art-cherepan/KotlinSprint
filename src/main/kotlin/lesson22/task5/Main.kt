package lesson22.task5

fun main() {
    val alphaCentauri = GalacticGuide(
        placeOrEventName = "Альфа Центавра",
        placeOrEventDescription = "Тройная звёздная система в созвездии Центавра",
        eventDateTime = "3042-02-12 15:30:00",
        distanceToEarth = 4.367,
    )

    val (placeOrEventName, placeOrEventDescription, eventDateTime, distanceToEarth) = alphaCentauri

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