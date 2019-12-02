package com.service;

public class EamsServiceImpl {
	
	public String login(String user,String pswrd, String type)
	{
		
		if( user.equals("admin") && pswrd.equals("nimda") &&  type.equals("1"))
			return "Admin Login";
		else if( user.equals("emp") && pswrd.equals("emp") &&  type.equals("3"))
			return "Employee Login";
		else if( user.equals("admin") && pswrd.equals("nimda") &&  type.equals("2"))
			return "Admin Staff Login";
		else
			return "Wrong Input";
	}
}
