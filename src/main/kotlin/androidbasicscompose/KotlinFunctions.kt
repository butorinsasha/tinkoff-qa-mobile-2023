package androidbasicscompose

fun main() {
    println(kotlinFunctionParametersAreImmutable(2, 4))
}

fun kotlinFunctionParametersAreImmutable(a: Int, b: Int): Int {
    // Val cannot be reassigned
    // a += 1

    val c = a + b
    return c
}