package Chapter7.MyExamples

data class Car(val wheelsCount: Int, val maxVelocity: Int) {
    var color = "red"
    var currentSpeed = 50
}

fun main(args: Array<String>) {

    // componentN() works only with constructor variables
    val car = Car(4, 170)
    val (wheelsCount, maxVelocity) = car
    println("$wheelsCount $maxVelocity")

    /* will not compile
    val color = car.component3()
    */
}