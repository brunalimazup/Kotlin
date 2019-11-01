// Return all products this customer has ordered
// Devolve todos os produtos que este cliente encomendou
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap { it.products }.toSet()

// Return all products that were ordered by at least one customer
// Devolve todos os produtos que foram pedidos por pelo menos um cliente
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { it.getOrderedProducts() }.toSet()