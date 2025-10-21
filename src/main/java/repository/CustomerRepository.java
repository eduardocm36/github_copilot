package repository;

import jakarta.enterprise.context.ApplicationScoped;
import model.Customer;

@ApplicationScoped
public class CustomerRepository {

    public Customer getCustomer() {
        return new Customer(
            1,
            "John Doe",
            "john.doe@example.com",
            "1234567890",
            "987654321"
        );
    }

}
