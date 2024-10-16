package com.handson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	
	@Autowired 
	CustomerRepository customerRepository;

	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	
	
}
