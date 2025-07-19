package com.jspider.passingobject;

import java.util.Scanner;

public class ProductUtility {
	
	static void displayProductInfo(Product p)
	{
		System.out.println("Product ID :"+p.pid);
		System.out.println("Product price :"+p.price);
	}
	
	static Product createProduct()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Product Id");
		int pid=scn.nextInt();
		System.out.println("Enter Product price");
		double price=scn.nextDouble();
		Product p=new Product(pid,price);
		return p;
				
	}

}
