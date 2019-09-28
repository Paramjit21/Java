package com.pojo;


public class Packaged extends Product{
	
	double tax = 0.10;
	int quantity;
	String date;
	
	public Packaged(String name,String id, double price, int quantity, String date) {
		super(name, id, price);
		this.quantity = quantity;	
		this.date = date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	@Override
	public double getPrice() {
		return super.getPrice();
	}
	
	@Override
	public String toString() {
		return super.toString() + " ,Use By:" + date+" ,Price: "+ Double.toString(super.getPrice()) + " ,Total tax: " + Double.toString(tax);
	}
	
	
	public double getTax() {
		return tax * super.getPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
