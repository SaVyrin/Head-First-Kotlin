package Chapter7.MyExamples

data class Mobile(val producer: String, val model: String) {
    var batteryCharge = 100
}

fun main(args: Array<String>) {
    val mobile1 = Mobile("Producer1", "CoolModel")
    mobile1.batteryCharge -= 10
    println(
        "Mobile 1 producer is ${mobile1.producer} model is ${mobile1.model} battery charge is ${mobile1.batteryCharge}"
    )

    // copy() copies only constructor values
    val mobile2 = mobile1.copy()
    println(
        "Mobile 2 producer is ${mobile2.producer} model is ${mobile2.model} battery charge is ${mobile2.batteryCharge}"
    )

    // copy() allows replacing constructor values (only constructor)
    val mobile3 = mobile1.copy(model = "BestModel")
    println(
        "Mobile 3 producer is ${mobile3.producer} model is ${mobile3.model} battery charge is ${mobile3.batteryCharge}"
    )
}