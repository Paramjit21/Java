package com.pojo;

public class Product {
	
	String name;
	String id;
	double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		return "Product name:" + name + ", id: " + id ;
	}
	

}
