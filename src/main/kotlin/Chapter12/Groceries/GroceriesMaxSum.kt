package Chapter12.Groceries

data class GroceryMaxSum(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

fun main(args: Array<String>) {
    val groceries = listOf(
        GroceryMaxSum("Tomatoes", "Vegetable", "lb", 3.0, 3),
        GroceryMaxSum("Mushrooms", "Vegetable", "lb", 4.0, 1),
        GroceryMaxSum("Bagels", "Bakery", "Pack", 1.5, 2),
        GroceryMaxSum("Olive oil", "Pantry", "Bottle", 6.0, 1),
        GroceryMaxSum("Ice cream", "Frozen", "Pack", 3.0, 2)
    )


    val highestUnitPriceGrocery = groceries.maxByOrNull { it.unitPrice * 5 }
    println("highestUnitPriceGrocery: $highestUnitPriceGrocery")
    val highestUnitPrice = groceries.maxOf { it.unitPrice }
    println("highestUnitPrice: $highestUnitPrice")

    val lowestQuantityGrocery = groceries.minByOrNull { it.quantity }
    println("lowestQuantityGrocery: $lowestQuantityGrocery")
    val lowestQuantity = groceries.minOf { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumOf { it.quantity }
    println("sumQuantity: $sumQuantity")
    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")
}