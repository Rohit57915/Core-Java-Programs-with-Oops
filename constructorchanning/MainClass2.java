package com.jspiders.constructorchanning;

import java.util.Scanner;

class City
 {
	 City(int a)
	 {
		 System.out.println("Banglore");
	 }
	 City(int a,double b)
	 {  
		 this(a);
		 System.out.println("Chennai");
	 }
	 City(int a,double b,boolean c)
	 {  
		 this(a,b);
		 System.out.println("Hydrabad");
	 }
 }
public class MainClass2
{
  public static void main(String[] args) 
  {
    City c1=new City(3);
}
}
