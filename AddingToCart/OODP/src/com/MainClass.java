package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.pojo.FreshFruit;
import com.pojo.Packaged;


public class MainClass {
	
	static List<Packaged> getObjectByName(String name, ArrayList<Packaged> list)
	{
		 return list.stream().filter(item -> item.getId().equals(name)).collect(Collectors.toList());
	}
	
	static List<FreshFruit> getObjectByNme(String name, ArrayList<FreshFruit> list)
	{
		 return list.stream().filter(item -> item.getId().contains(name)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		
		ArrayList<FreshFruit> FruitList = new ArrayList<FreshFruit>();
		ArrayList<Packaged> PackageList = new ArrayList<Packaged>();
		double totalAmount = 0.0;
		int totalItemInCart = 0;
		double TotalPayableTax = 0.0;
		String choice;
		List<Packaged> pack;
		List<FreshFruit> fruit;
		Scanner sc = new Scanner(System.in);
		
		FreshFruit f1 = new FreshFruit("Apple", 100.0, "Apl101",5);
		FreshFruit f2 = new FreshFruit("Mango", 150.0, "Mngo101",5);
		FreshFruit f3 = new FreshFruit("Banana", 70.0, "Bnan101",5);
		FreshFruit f4 = new FreshFruit("PineApple", 200.0, "PineApl101",5);
		FreshFruit f5 = new FreshFruit("Grapes", 120.0, "Grpe101",5);
		FruitList.add(f5);
		FruitList.add(f4);
		FruitList.add(f3);
		FruitList.add(f2);
		FruitList.add(f1);
		
		
		Packaged p1 = new Packaged("Egg", "Egg101", 40.0, 5, "2-Spt-2019");
		Packaged p2 = new Packaged("Choclate", "Choc101", 10.0, 5, "10-Nov-2019");
		Packaged p3 = new Packaged("Lays", "Lys101", 20.0, 8, "24-Jan-2020");
		Packaged p4 = new Packaged("Candy", "Cndy101", 5.0, 15, "16-Spt-2019");
		Packaged p5 = new Packaged("Nuts", "Nut101", 10.0, 10, "8-Oct-2019");
		PackageList.add(p5);
		PackageList.add(p4);
		PackageList.add(p3);
		PackageList.add(p2);
		PackageList.add(p1);
		
		System.out.println("Fresh Fruits:  \n------------------------------------------");
		FruitList.forEach((fruitt) -> System.out.println(fruitt));
		System.out.println("\nPackaged Items: \n------------------------------------------");
		PackageList.forEach((packk) -> System.out.println(packk));
		
		while(true)
		{
			System.out.println("--------------------------------------------");
			System.out.print("Enter product id to buy or any key to checkout/exit: ");
			choice = sc.nextLine();
			System.out.println("--------------------------------------------");
			switch (choice) {
							case "Egg101": 
								pack = getObjectByName(choice, PackageList);
								totalAmount += pack.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += pack.get(0).getTax();
								System.out.println(pack.get(0).getQuantity() + " "+ pack.get(0).getName() +" in the package");
								System.out.println("Added to cart");
							break;
							case "Choc101": 
								pack = getObjectByName(choice, PackageList);
								totalAmount += pack.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += pack.get(0).getTax();
								System.out.println(pack.get(0).getQuantity() + " "+ pack.get(0).getName() +" in the package");
								System.out.println("Added to cart");
							break;
							case "Lys101": 
								pack = getObjectByName(choice, PackageList);
								totalAmount += pack.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += pack.get(0).getTax();
								System.out.println(pack.get(0).getQuantity() + " "+ pack.get(0).getName() +" in the package");
								System.out.println("Added to cart");
							break;
							case "Cndy101": 
								pack = getObjectByName(choice, PackageList);
								totalAmount += pack.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += pack.get(0).getTax();
								System.out.println(pack.get(0).getQuantity() + " "+ pack.get(0).getName() +" in the package");
								System.out.println("Added to cart");
							break;
							case "Nut101": 
								pack = getObjectByName(choice, PackageList);
								totalAmount += pack.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += pack.get(0).getTax();
								System.out.println(pack.get(0).getQuantity() + " "+ pack.get(0).getName() +" in the package");
								System.out.println("Added to cart");
							break;
							case "Apl101": 
								fruit = getObjectByNme(choice, FruitList);
								totalAmount += fruit.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += fruit.get(0).getTax();
								System.out.println("the "+ fruit.get(0).getName() +" is " +fruit.get(0).getWeight()+" grams");
								System.out.println("Added to cart");
							break;
							case "Mngo101": 
								fruit = getObjectByNme(choice, FruitList);
								totalAmount += fruit.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += fruit.get(0).getTax();
								System.out.println("the "+ fruit.get(0).getName() +" is " +fruit.get(0).getWeight()+" grams");
								System.out.println("Added to cart");
							break;
							case "Bnan101": 
								 fruit = getObjectByNme(choice, FruitList);
								totalAmount += fruit.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += fruit.get(0).getTax();
								System.out.println("the "+ fruit.get(0).getName() +" is " +fruit.get(0).getWeight()+" grams");
								System.out.println("Added to cart");
							break;
							case "PineApl101": 
								 fruit = getObjectByNme(choice, FruitList);
								totalAmount += fruit.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += fruit.get(0).getTax();
								System.out.println("the "+ fruit.get(0).getName() +" is " +fruit.get(0).getWeight()+" grams");
								System.out.println("Added to cart");
							break;
							case "Grpe101": 
								 fruit = getObjectByNme(choice, FruitList);
								totalAmount += fruit.get(0).getPrice();
								totalItemInCart += 1;
								TotalPayableTax += fruit.get(0).getTax();
								System.out.println("the "+ fruit.get(0).getName() +" is " +fruit.get(0).getWeight()+" grams");
								System.out.println("Added to cart");
							break;
			

			default:
				System.out.println("Bill Generated \n-------------------------------------------");
				System.out.println("Total Items: "+totalItemInCart + " \n Total Price: "+ totalAmount + "\n Total Tax: "+TotalPayableTax +"\nTotal Payable Amount: "+ (totalAmount+TotalPayableTax));
				System.out.println("--------------------------------------------------");
				sc.close();
				System.exit(0);
				break;
			}
		}
		
	}

}
