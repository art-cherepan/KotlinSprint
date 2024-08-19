package lesson2

fun main() {
    val crystalOreWithoutBuffCount = 7
    val ironOreWithoutBuffCount = 11
    val buffPercent = 20

    val crystalOreBuff = calculateBuff(crystalOreWithoutBuffCount, buffPercent)
    val ironOreBuff = calculateBuff(ironOreWithoutBuffCount, buffPercent)

    println("Бафф от кристальной руды: $crystalOreBuff")
    println("Бафф от железной руды: $ironOreBuff")
}

fun calculateBuff(oreCount: Int, buffPercent: Int): Int {
    return (oreCount * buffPercent) / 100
}