package lesson21.task4

import java.io.File
import java.nio.file.Paths
import java.util.*

fun main() {
    val path = Paths.get("").toAbsolutePath().toString() + "/test.txt"
    val file = File(path)
    file.customWrite("Привет", path)
}

fun File.customWrite(text: String, path: String) {
    File(path).writeText(text.lowercase(Locale.getDefault()))
}