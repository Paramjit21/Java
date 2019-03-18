package LabWork;

import java.util.Date;
import java.util.Scanner;

public class DateDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		System.out.print("Enter date: ");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		Date d = new Date();
		long l = (long)Date.parse(input);
		Date newD = new Date(l);
		int du = d.compareTo(newD); 
		System.out.println("Duration with '"+d+"' is "+du);
		sc.close();
	}

}
