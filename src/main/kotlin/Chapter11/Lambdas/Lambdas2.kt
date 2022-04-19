package Chapter11.Lambdas

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertToFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun main(args: Array<String>) {
    convert(20.0) { it * 1.8 + 32 }
    convertToFive { it * 1.8 + 32 }
}