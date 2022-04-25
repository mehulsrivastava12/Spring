package com.springcore.lifecycle;

public class Pricing {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pricing() {
		super();
	}

	@Override
	public String toString() {
		return "Pricing [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
