package ll.labs.customerservice.controller;

import ll.labs.customerservice.client.AccountClient;
import ll.labs.customerservice.model.Customer;
import ll.labs.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @Autowired
    AccountClient accountClient;

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }


    @GetMapping("/{id}/with-accounts")
    public Customer findByIdWithAccounts(@PathVariable("id") Long id) {
        Customer customer = repository.findById(id);
        customer.setAccounts(accountClient.findByAccounts(customer.getId()));
        return customer;
    }
}
