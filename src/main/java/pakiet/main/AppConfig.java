package pakiet.main;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pakiet.repository.CustomerRepository;
import pakiet.repository.HibernateCustomerRepositoryImpl;
import pakiet.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerServiceImpl getCustomerService() {
      CustomerServiceImpl service = new CustomerServiceImpl();
      service.setCustomerRepository(getCustomerRepository());
      return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}

