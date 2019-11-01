// Return true if all customers are from the given city
// Retorna true se todos os clientes forem da cidade especificada
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

// Return true if there is at least one customer from the given city
// Retorna true se houver pelo menos um cliente da cidade especificada
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any {it.city == city}

// Return the number of customers from the given city
// Retorna o número de clientes da cidade especificada
fun Shop.countCustomersFrom(city: City): Int = customers.count {it.city == city}

// Return a customer who lives in the given city, or null if there is none
// Retorna um cliente que mora na cidade especificada ou nulo se não houver
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city == city }
