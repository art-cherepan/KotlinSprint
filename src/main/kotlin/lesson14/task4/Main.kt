package lesson14.task4

fun main() {
    val firstSatellite = Satellite(
        name = "Phobos",
        hasAtmosphere = false,
        suitableForLanding = false,
    )

    val secondSatellite = Satellite(
        name = "Deimos",
        hasAtmosphere = false,
        suitableForLanding = false,
    )

    val planet = Planet(
        name = "Mars",
        hasAtmosphere = true,
        suitableForLanding = true,
        satellites = listOf(firstSatellite, secondSatellite),
    )

    var planetInfo = "Планета: ${planet.name}\nСпутники:\n"
    planet.satellites?.forEach { planetInfo += it.name + "\n" }

    println(planetInfo)
}

abstract class CelestialBody(
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean,
) {
}

class Satellite(
    val name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialBody(
    hasAtmosphere,
    suitableForLanding,
) {
}

class Planet(
    val name: String,
    val satellites: List<Satellite>? = null,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialBody(
    hasAtmosphere,
    suitableForLanding,
) {
}