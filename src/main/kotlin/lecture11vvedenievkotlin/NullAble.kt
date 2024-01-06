package lecture11vvedenievkotlin

fun main() {
    NullAble().printMe()
}

class NullAble {
    val a: String = "xyz"
    val b: String? = null
    val c: String? = arrayListOf("qwerty", null).random()

    val l1 = a.length
    val l2 = b?.length
//    val l3 = b!!.length Exception in thread "main" java.lang.NullPointerException
    val l4 = if (c != null) c.length else -1
    val l5 = c?.length ?: -1



    fun printMe() {
        println("l1=$l1")
        println("l2=$l2")
//        println("l3=$l3")
        println("l4=$l4")
        println("l5=$l5")
    }
}