package pakiet.service;

import pakiet.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakiet.repository.CustomerRepository;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

    //@Autowired
    private CustomerRepository customerRepository;

@Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
