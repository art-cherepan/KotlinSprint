package lesson2

fun main() {
    val crystalOreWithoutBuffCount = 7
    val ironOreWithoutBuffCount = 11

    val crystalOreBuff = calculateBuff(crystalOreWithoutBuffCount)
    val ironOreBuff = calculateBuff(ironOreWithoutBuffCount)

    println("Бафф от кристальной руды: $crystalOreBuff")
    println("Бафф от железной руды: $ironOreBuff")
}

fun calculateBuff(oreCount: Int): Int {
    return (oreCount * 0.2).toInt()
}