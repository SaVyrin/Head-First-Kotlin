package Chapter7.MyExamples


data class Shape(val name: String, var area: Double) {
    var color = "white"
}

fun main(args: Array<String>) {

    // equals() compares only variables in constructor
    // hashCode() hashes only variables in constructor

    val shape1 = Shape("square", 20.0)
    val shape2 = Shape("square", 20.0)

    println(shape1 == shape2)
    println("${shape1.hashCode()} ${shape2.hashCode()}")

    shape2.color = "green"

    println(shape1 == shape2)
    println("${shape1.hashCode()} ${shape2.hashCode()}")

    shape1.area = 10.0

    println(shape1 == shape2)
    println("${shape1.hashCode()} ${shape2.hashCode()}")
}