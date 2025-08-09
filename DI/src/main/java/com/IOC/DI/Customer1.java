package com.IOC.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Customer1 {

	private int id;
	private String name;
	
	@Autowired //get the component class object in another class
	Customer2 cust2;
	
	@Autowired
	Customer3 cust3;
	public Customer1() {
		System.out.println("Customer1 class constructor.");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("Customer 1 object printed.");
		cust2.show();
		cust3.show();
	}
}
