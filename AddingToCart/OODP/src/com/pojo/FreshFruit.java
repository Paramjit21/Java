package com.pojo;

public class FreshFruit extends Product{
	
	Double tax = 0.0 ;
	double weight;
	
	public FreshFruit(String name, double price, String id,double weight) {
		super(name, id, price);
		this.weight = weight;
		
	}
	
	public FreshFruit() {
		// TODO Auto-generated constructor stub
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Double getTax() {
		return tax;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + tax;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " ,Price:"+ Double.toString(super.getPrice()) + " ,Total tax: " + Double.toString(tax);
	}

}
