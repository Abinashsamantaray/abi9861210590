package com.digit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	private String name;
	@Id
	private int id; 
	private String mobilenum;
//hello
	public Customer() {
		super();
	}

	public Customer(String name, int id, String mobilenum) {
		super();
		this.name = name;
		this.id = id;
		this.mobilenum = mobilenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", mobilenum=" + mobilenum + "]";
	}
	






}
