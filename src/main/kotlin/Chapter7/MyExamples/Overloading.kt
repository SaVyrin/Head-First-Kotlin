package Chapter7.MyExamples

import kotlin.math.pow

// overloaded functions have same names and different parameters
// they also can have different return type
// functions with same names and params but different return types don't compile
fun curveFunction(x: Int): Int {
    return 2 * x
}

/* Won't compile - need different params
fun curveFunction(x: Int): Double {
    return 2.0 * x
}
*/

fun curveFunction(x: Int, y: Int): Int {
    return (x + 3) * y - 24
}

fun curveFunction(x: Double, y: Double): Double {
    return (x + 3).pow(y)
}

fun main(args: Array<String>) {
    // using overloaded functions
    println(curveFunction(5))
    println(curveFunction(5, 1))
    println(curveFunction(5.0, 1.0))
}