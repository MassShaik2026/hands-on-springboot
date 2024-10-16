package com.handson;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(path = "/get_customer")
	public String getCustomer() {
		return "Welcome to Registration Customer!";
	}

	@GetMapping(path = "/get_customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@PostMapping(path = "/add_customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
