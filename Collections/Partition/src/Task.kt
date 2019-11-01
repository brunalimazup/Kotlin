// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    val (delivery, unDelivery) = it.orders.partition { it.isDelivered}
    unDelivery.size > delivery.size
}.toSet()