package com.model;

public class Customer {
	
	private int custNo;
	private String name;
	private String country;
	private long contactno;
	
	public Customer() {
		
	}
	
	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public Customer(int custNumber, String name, String country, long contactno) {
		this.custNo = custNumber;
		this.name = name;
		this.country = country;
		this.contactno=contactno;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
