package pakiet.repository;

import pakiet.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
