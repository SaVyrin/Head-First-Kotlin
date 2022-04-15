package Chapter7.MyExamples

data class Door(val height: Int, val width: Int) {
    val color = "white"
    val hasWindow = false
    var openTime = 3
}

fun main(args: Array<String>) {

    // toString() prints only constructor variables

    val door= Door(2, 1)
    println(door.toString())
}