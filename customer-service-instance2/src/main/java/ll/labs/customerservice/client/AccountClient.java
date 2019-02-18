package ll.labs.customerservice.client;

import ll.labs.customerservice.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountClient {

	@GetMapping("/customer/{customerId}")
	public List<Account> findByAccounts(@PathVariable("customerId") Long customerId);

	
}
