package lesson21.task4

import java.io.File
import java.nio.file.Paths
import java.util.*

fun main() {
    val path = Paths.get("").toAbsolutePath().toString() + "/test.txt"
    val file = File(path)
    file.customWrite("Привет")
}

fun File.customWrite(text: String) {
    this.writeText(text.lowercase(Locale.getDefault()))
}