package repository;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import model.Customer;

@ApplicationScoped
public class CustomerRepository {

    public Optional<Customer> getCustomer() {
        return Optional.of(new Customer(
            1,
            "John Doe",
            "john.doe@example.com",
            "1234567890",
            "987654321"
        ));
    }

}
