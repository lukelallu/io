package ll.labs.accountservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class AccountRepository {

    private List<Account> accounts = new ArrayList<>();

    public Account add(Account account) {
        accounts.add(account);
        return account;
    }


    public List<Account> findByCustomer(Long customerId) {

        List<Account> act = new ArrayList<> ();
        for (Account a : accounts) {
            if (a.getId().equals(customerId)) {
                act.add(a);
            }
        }
        return act;
    }


}
