// main function
fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

fun buildString(foo: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.foo()
    return stringBuilder.toString()
}