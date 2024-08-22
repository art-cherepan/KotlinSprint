package lesson2

const val BUFF_MAX_PERCENT = 100

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
    return (oreCount * buffPercent) / BUFF_MAX_PERCENT
}