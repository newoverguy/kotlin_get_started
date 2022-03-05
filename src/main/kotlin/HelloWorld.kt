
fun main(args: Array<String>) {
    print("Hello ")
    println("world!")

    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("main arguments: ${args.joinToString()} ")

    // call fun_sum
    // println(sum(2, 3))
    // call fun_printSum
//    printSum(1, 2)
    val a: Int = 1
    val b = 2 // refer a type
    val c: Int
    c = 3

    val PI = 3
    var x = 0
    fun incrementX() {
        x += PI
    }

    val nullVal: String? = returnNull();
    println("Checking null value.")
    println(nullVal?.length) // if nullVal is null, print 'null'
    println("End of Checking null value.")


    val price = """
        ${'$'}
    """.trimIndent()
    println(price)

}

fun returnNull(): String? {
    return null;
}

fun sum(a: Int, b:Int): Int {
    return a + b
}

// Its return type is inferred
fun sumOther(a: Int, b: Int) = a + b

fun printSum(a: Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Inheritance
open class Shape
// default constructor with parameters
class Retangle(var height: Double, var length: Double) {
    var perimeter = (height * length) * 2
}

class Triangle(var height: Double, var length: Double): Shape() {

}









