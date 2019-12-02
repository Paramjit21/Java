package com.bean;

public class Employee {
	
	String EmployeeName;
	String Department;
	String Id;
	double Salary;
	String EmploymentType;
	double LossofPay;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeeName, String department, String id, double salary, String employmentType,
			double lossofPay) {
		super();
		EmployeeName = employeeName;
		Department = department;
		Id = id;
		Salary = salary;
		EmploymentType = employmentType;
		LossofPay = lossofPay;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getEmploymentType() {
		return EmploymentType;
	}
	public void setEmploymentType(String employmentType) {
		EmploymentType = employmentType;
	}
	public double getLossofPay() {
		return LossofPay;
	}
	public void setLossofPay(double lossofPay) {
		LossofPay = lossofPay;
	}
	
	

}
