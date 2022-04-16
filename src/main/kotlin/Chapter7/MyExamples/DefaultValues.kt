package Chapter7.MyExamples

// class with default values
class Balloon(val color: String = "white", val size: Int = 5)

// function with default values
fun increaseInLoop(iterationsCount: Int = 10000, valueToIncrease: Int): Int {
    var resultValue = valueToIncrease
    for (iteration in 1..iterationsCount) {
        resultValue++
    }
    return resultValue
}

fun main(args: Array<String>) {
    // using default iterationsCount
    println(increaseInLoop(valueToIncrease = 10))

    /* Won't compile because 10 will be used as iterationsCount param.
       Arguments must be given in the same order as params.
    println(increaseInLoop(10))
    */

    // using iterationsCount = 300
    println(increaseInLoop(300, 10))


    // creating balloon with default values
    val defaultBalloon = Balloon()
    println("Default balloon color is ${defaultBalloon.color} and size is ${defaultBalloon.size}")

    // creating balloon with custom size
    val customBalloon = Balloon(size = 10)
    println("Custom balloon color is ${customBalloon.color} and size is ${customBalloon.size}")
}