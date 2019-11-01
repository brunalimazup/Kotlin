// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.

// Retorna a soma dos preços de todos os produtos que um cliente encomendou.
// Nota: o cliente pode solicitar o mesmo produto várias vezes

fun Customer.getTotalOrderPrice(): Double = orders.flatMap{ it.products }.sumByDouble { it.price }