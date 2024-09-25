package lesson10

fun main() {
    val userLogin = readln()
    val userPassword = readln()

    val token = verifyCredentials(userLogin = userLogin, userPassword = userPassword)

    if (token == null) {
        println("Пользователь не прошел верификацию")

        return
    }

    val cart = getProductsInCart(token)

    if (cart == null) {
        println("Использован невалидный токен")

        return
    }

    cart.forEach { println(it) }
}

fun getProductsInCart(token: String): Array<String>? {
    if (token.length != TOKEN_LENGTH_FINISH) {
        return null
    }

    return CART
}

fun verifyCredentials(userLogin: String, userPassword: String): String? {
    if (userLogin == LOGIN && userPassword == PASSWORD) {
        return generateToken()
    }

    return null
}

fun generateToken(): String
{
    var token = ""
    val tokenSymbols = (0 .. 9) + ('a' .. 'z')

    for (i in TOKEN_LENGTH_START until  TOKEN_LENGTH_FINISH) {
        token += tokenSymbols.random()
    }

    return token
}

const val LOGIN = "Fabien"
const val PASSWORD = "w23f#gt%"
const val TOKEN_LENGTH_START = 0
const val TOKEN_LENGTH_FINISH = 32
val CART = arrayOf("product1", "product2", "product3")