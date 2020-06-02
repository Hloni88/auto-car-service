package za.co.app.autocarservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.app.autocarservice.model.Customer;
import za.co.app.autocarservice.service.CustomerService;
import java.util.List;
import java.util.logging.Logger;
@RestController
@RequestMapping("/api/customer")
public class CustomerController { private final Logger logger = Logger.getLogger(za.co.app.autocarservice.controller.CustomerController.class.getName());

    @Autowired
    private CustomerService customerService;

        @GetMapping(value = "/List")
        public List<Customer> getAllCustomer() {
            logger.info("getAllCustomer");
            List<Customer> customers = customerService.getAllCustomer();
            return customers;

        }

        @PostMapping("/addCustomer")
        public Customer createCustomer(@RequestBody Customer customer) {
            logger.info("createCustomer");
            return customerService.saveCustomer(customer);
        }

        @PutMapping("/updateCustomer/{id}")
        public Customer updateCustomer(@RequestBody Customer customer, @PathVariable long id) {
            logger.info("updateCustomer");
            return customerService.updateCustomerDetails(customer, id);
        }

        @GetMapping(value = "/showCustomer/{id}")
        public Customer getCustomerById(@PathVariable long id) {
            logger.info("getCustomerById");
            return customerService.getCustomerById(id);
        }

        @DeleteMapping("/deleteCustomer/{id}")
        public int deleteCustomer(@PathVariable long id) {
            logger.info("deleteSalesPerson");
            return customerService.removeCustomer(id);
        }

        @GetMapping(value = "/searchCustomer")
        public List<Customer> getAllCustomersStartingWithSpecifChar(@RequestParam String first_name) {
            List<Customer> customers = customerService.getAllCustomerStartingWithSpecifChar(first_name);
            return customers;
        }
    }
