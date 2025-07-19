package com.jspider.passingobject;

public class MainClass2 {
	
	public static void main(String[] args)
	{
		Product p1=ProductUtility.createProduct();
		ProductUtility.displayProductInfo(p1);
		
		Product p2=ProductUtility.createProduct();
		ProductUtility.displayProductInfo(p2);
		
		Product p3=ProductUtility.createProduct();
		ProductUtility.displayProductInfo(p3);
	}

}
