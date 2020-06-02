package za.co.app.autocarservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.app.autocarservice.dao.CustomerDao;
import za.co.app.autocarservice.model.Customer;
import za.co.app.autocarservice.model.SalesPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("customerService")
@Transactional
public class CustomerImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer saveCustomer(Customer customer) {
        Customer newCustomer = customerDao.save(customer);
        return newCustomer;
    }

    @Override
    public Customer getCustomerById(long id) {
        Customer customer = customerDao.getOne(id);
        return customer;
    }

    @Override
    public Customer updateCustomerDetails(Customer customer, Long id) {
        Customer updateCustomer = customerDao.getOne(id);
        updateCustomer.setFirstName(customer.getFirstName());
        updateCustomer.setLastName(customer.getLastName());
        updateCustomer.setAddress(customer.getAddress());
        updateCustomer.setCity(customer.getCity());
        updateCustomer.setCountry(customer.getCountry());
        updateCustomer.setPhoneNumber(customer.getPhoneNumber());
        updateCustomer.setPostalCode(customer.getPostalCode());
        updateCustomer.setProvince(customer.getProvince());

        return updateCustomer;
    }

    @Override
    public int removeCustomer(long id) {
        Optional<Customer> deleteCustomer = customerDao.findById(id);
        if(deleteCustomer.isPresent()){
            customerDao.delete(deleteCustomer.get());
            return 1;
        }
        return 0;
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = customerDao.findAll();
        if (customers != null && customers.size() > 0){
            return customers;
        }else{
            return new ArrayList<>();
        }

    }

    @Override
    public List<Customer> getAllCustomerStartingWithSpecifChar(String name) {
        List<Customer> customers =  customerDao.searchListOfCustomerByFirstName(name);
        if (customers != null && customers.size() > 0){
            return customers;
        }else{
            return new ArrayList<>();
        }

    }
}
