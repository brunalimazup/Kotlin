import kotlin.math.max

// Return a customer whose order count is the highest among all customers
// Retorna um cliente cuja contagem de pedidos é a mais alta entre todos os clientes
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { it.orders.size }

// Return the most expensive product which has been ordered
// Devolve o produto mais caro que foi encomendado
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { it.products }.maxBy { it.price }
