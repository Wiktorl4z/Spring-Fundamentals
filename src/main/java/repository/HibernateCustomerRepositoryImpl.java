package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Wiktor");
        customer.setLastName("Kalinowski");

        customers.add(customer);

        return customers;
    }
}
