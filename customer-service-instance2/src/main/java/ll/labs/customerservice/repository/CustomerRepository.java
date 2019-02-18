package ll.labs.customerservice.repository;

import ll.labs.customerservice.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    public Customer add(Customer organization) {
        organization.setId((long) (customers.size()+1));
        customers.add(organization);
        return organization;
    }

    public Customer findById(Long id) {
        Optional<Customer> customer = Optional.empty();
        for (Customer a : customers) {
            if (a.getId().equals(id)) {
                customer = Optional.of(a);
                break;
            }
        }
        if (customer.isPresent())
            return customer.get();
        else
            return null;
    }

    public List<Customer> findAll() {
        return customers;
    }
}
