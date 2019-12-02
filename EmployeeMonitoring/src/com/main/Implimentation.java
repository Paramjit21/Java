package com.main;
import com.service.EamsServiceImpl;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;


public class Implimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName;
		String Password;
		String Type;
		EamsServiceImpl ser = new EamsServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Username:");
			UserName = sc.next();
			System.out.print("Password:");
			Password = sc.next();
			System.out.print("Type:");
			Type = sc.next();
			System.out.println(ser.login(UserName, Password, Type));
		}
		
		
	}

}
