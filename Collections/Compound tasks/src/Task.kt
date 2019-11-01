// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)

// Devolve o produto mais caro entre todos os produtos entregues
// (use o sinalizador Order.isDelivered)

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.

// Retorna quantas vezes o produto fornecido foi pedido.
// Nota: um cliente pode solicitar o mesmo produto várias vezes.

    fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
        return customers.flatMap { it.getOrderedProductsList() }.count { it == product }
    }

    fun Customer.getOrderedProductsList(): List<Product>{
        return orders.flatMap { it.products }
    }


