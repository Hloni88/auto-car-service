package za.co.app.autocarservice.service;

import org.springframework.stereotype.Service;
import za.co.app.autocarservice.model.Customer;
import za.co.app.autocarservice.model.SalesPerson;

import java.util.List;
@Service
public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer getCustomerById(long id);
    Customer updateCustomerDetails(Customer customer,Long id);
    int removeCustomer(long id);
    List<Customer> getAllCustomer();
    List<Customer> getAllCustomerStartingWithSpecifChar(String name);
}
