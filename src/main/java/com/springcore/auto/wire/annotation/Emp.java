package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values");
	}

	public Emp() {
		super();
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
