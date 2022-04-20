package Chapter12.Groceries

data class GroceriesGroupByFold(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

fun main(args: Array<String>) {
    val groceries = listOf(
        GroceryFilterMapForEach("Tomatoes", "Vegetable", "lb", 3.0, 3),
        GroceryFilterMapForEach("Mushrooms", "Vegetable", "lb", 4.0, 1),
        GroceryFilterMapForEach("Bagels", "Bakery", "Pack", 1.5, 2),
        GroceryFilterMapForEach("Olive oil", "Pantry", "Bottle", 6.0, 1),
        GroceryFilterMapForEach("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("  ${it.name}") }
    }

    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")

    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")

    val changeFrom50 = groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println("changeFrom50: $changeFrom50")
}