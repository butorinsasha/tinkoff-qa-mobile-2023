package lecture11vvedenievkotlin

fun main() {
    println(KotlinTypes().knockKnock1())
    println(KotlinTypes().knockKnock2())
    println(KotlinTypes().knockKnock3())
}

class KotlinTypes {

    fun knockKnock1(): Unit {
        println("Who is there 1?")
    }

    fun knockKnock2() {
        println("Who is there 2?")
    }

    fun knockKnock3() = println("Who is there 3 ?")

    val b: Boolean = true
    val i: Int = 1
    val d: Double = 2.0
}