package com.springframework.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.hibernate.mapping.Set;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.model.Customer;

import javassist.bytecode.Descriptor.Iterator;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	Map<Integer, Customer> custStores = new HashMap<Integer, Customer>();


	@RequestMapping(method=RequestMethod.GET,
			value = "healthcheck")
	public String index() {
		return "Customer Sping Project Demo";
	}

	@PostConstruct
	public void initIt() throws Exception{
		Customer c1 = new Customer(1,"a","b",1);
		Customer c2 = new Customer(2,"a","b",2);
		custStores.put(c1.getCustomerID(), c1);
		custStores.put(c2.getCustomerID(), c2);
	}

	@RequestMapping(method=RequestMethod.GET,
			value="/get",
			produces = "application/json")
	public Customer getMethod(@RequestParam("customerID") int customerID) {
		return custStores.get(customerID);
	}

	@RequestMapping(method=RequestMethod.POST,
			value="/post",
			produces = "application/json",
			consumes = "application/json")
	@ResponseBody
	public Customer postMethod(@RequestBody Customer customerInput) {
		custStores.put(customerInput.getCustomerID(), customerInput);
		return customerInput;
	}

	@RequestMapping(method=RequestMethod.PUT,
			value = "/put/{customerID}",
			produces = "application/json",
			consumes = "application/json")
	@ResponseBody
	public Customer putMethod(@PathVariable int customerID, @RequestBody Customer customerInput) {
		custStores.remove(customerID);
		customerInput.setCustomerID(100);
		custStores.put(customerID, customerInput);
		System.out.println("Customer Stores after PUT");
		return customerInput;
	}

	@RequestMapping(method=RequestMethod.DELETE,
			value="/delete/{customerID}",
			consumes = "application/json")
	@ResponseBody
	public Customer deleteMethod(@PathVariable int customerID, @RequestBody Customer customerInput) {
		custStores.remove(customerID);
		return  customerInput;
	}
}
