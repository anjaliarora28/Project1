package com.ofss;

public class Customer {

	private String customerName;
	private String city;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String city) {
		super();
		this.customerName = customerName;
		this.city = city;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", city=" + city + "]";
	}
	
	
}
