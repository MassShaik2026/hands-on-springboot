package com.handson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Use IDENTITY for MySQL auto-increment
	private int customerId;

	@Column
	private String customerName;

	@Column
	private String age;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Customer(int customerId, String customerName, String age) {
		super();
		this.customerName = customerName;
		this.age = age;
	}

	public Customer() {
		super();
	}

}
