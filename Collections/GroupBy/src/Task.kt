// Return a map of the customers living in each city
// Retorna um mapa dos clientes que moram em cada cidade
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy {it.city}