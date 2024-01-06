package lecture11vvedenievkotlin

fun main() {
//    ByeJava.main(arrayOf())

    Casting().casting()

}

class Casting {
//    On the contrary, Kotlin does not support implicit type conversion from smaller to larger types.
//    This means that an Int variable cannot be converted to a Long variable without an explicit cast or type conversion:
    fun noImplicitCasting() {
        // this code is invalid in Kotlin
//        val number1: Int = 42
//        val number42: Long = number1 // Type mismatch: inferred type is Int but Long was expected

    }

    fun explicitTypeConverting() {
        val number1: Int = 42
        val number2: Long = number1.toLong()

        val foo: Any = "Hello, World!"
        val str2: String = foo.toString()
    }

    // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Long
    fun explicitUnsafeUnSuccessfullCasting() {
        val number1: Int = 42
        val number3: Long = number1 as Long
    }

    // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    fun explicitUnsafeUnSuccessfullCasting2() {
        var foo: Any = 42
        val str1: String = foo as String
        println(str1)
    }

    // this code is valid in Kotlin
    fun explicitUnsafeSuccessfullCasting() {
        var foo: Any = "Hello, World!"
        val str1: String = foo as String
        println(str1)
    }

    // null cannot be cast to non-null type kotlin.String
    fun explicitUnsafeUnSuccessfullCasting3() {
        val foo: Any? = null
        val str1: String = foo as String
        println(str1)
    }

    fun casting() {
        val bar: Any? = null
        val foo: Any? = 1


        val str1: String? = bar as String?  // null  -> null
        val str2: String? = foo as String?  // ClassCastException: java.lang.Integer cannot be cast to java.lang.String

        val str3: String? = bar as? String  // null  -> null
        val str4: String? = foo as? String? // 1 -> null


        println("${bar}  -> ${str1}")   // null  -> null
        println("${foo} -> ${str2}")    // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        println("${bar}  -> ${str3}")   // null  -> null
        println("${foo} -> ${str4}")    // 1 -> null
    }

    fun explicitSafeUnsucceslullHandledCasting1() {
        val foo: Any = 42
        try {
            val str1: String = foo as String
            println(str1)
        } catch (e : ClassCastException) {
            println ("Cast failed!")
        }
        // This is the only way you have to avoid errors when using the Kotlin Unsafe cast operator.
    }

    fun explicitSafeUnsucceslullHandledCasting2() {
        val foo: Any = 42
        val str1: String? = foo as? String
        println(str1)
    }
}