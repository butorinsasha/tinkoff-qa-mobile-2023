package lecture11vvedenievkotlin

import ByeJava

val any1: Any
    get() {
        TODO()
    }

//val any2: Any = TODO()

val pakageName: String = object{}.javaClass.`package`.name

fun main() {
    printMessage()
    HelloAgainKotlin().goKotlin();
    ByeJava()
}

fun printMessage() {
    val funcName = object{}.javaClass.enclosingMethod.name
    println("Hello Again Kotlin. You have package-level function full-named: $pakageName.$funcName()")
}

class HelloAgainKotlin {

    fun goKotlin() {
        println("this.javaClass.name = ${this.javaClass.name}")
        println("this.javaClass.canonicalName = ${this.javaClass.canonicalName}")
        println("this.javaClass.simpleName = ${this.javaClass.simpleName}")
        println("this.javaClass.typeName = ${this.javaClass.typeName}")

    }
}