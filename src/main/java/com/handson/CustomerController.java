package com.handson;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<String> getCustomers() {
		return Arrays.asList("Shaik","Masthan");
	}

}


