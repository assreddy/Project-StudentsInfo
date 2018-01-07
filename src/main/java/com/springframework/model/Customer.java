package com.springframework.model;

public class Customer {

	private int customerID;
	private String lastName;
	private String firstName;
	private int age;

	public Customer() {}

	public Customer(int customerID, String lastName, String firstName, int age) {
		super();
		this.customerID = customerID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String printCustomer() {
		String info = String.format("custId = %d, firstname = %s, lastname = %s, age = %d", customerID, firstName, lastName, age);
		return info;
	}

}