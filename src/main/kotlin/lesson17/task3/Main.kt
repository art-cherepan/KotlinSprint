package lesson17.task3

fun main() {
    var folder = Folder(
        name = "Важное",
        fileCount = 100,
    )

    println(folder.name)
    println(folder.fileCount)

    folder.setSecret(true)

    println(folder.name)
    println(folder.fileCount)
}

class Folder(
    name: String,
    fileCount: Int,
    private var isSecret: Boolean = false,
) {
    var name = name
        get() {
            if (isSecret) {
                return "скрытая папка"
            }

            return field
        }

    var fileCount = fileCount
        get() {
            if (isSecret) {
                return 0
            }

            return field
        }

    fun setSecret(_isSecret: Boolean) {
        isSecret = _isSecret
    }
}