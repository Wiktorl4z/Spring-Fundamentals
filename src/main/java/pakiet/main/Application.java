package pakiet.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pakiet.service.CustomerService;

public class Application {

    public static void main(String[] args) {

//        CustomerService pakiet.service = new CustomerServiceImpl();
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService",CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
