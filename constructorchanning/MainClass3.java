package com.jspiders.constructorchanning;
 class Car
 {
	 Car(int a)
	 {
		 System.out.println("Basic Varient");
	 }
	 Car(double d)
	 {
		 this(10);
		 System.out.println("Middle Varient");
	 }
	 Car(String s)
	 {
		 this(4.5);
		 System.out.println("Top Varient");
	 }
	 
 }
public class MainClass3 
{
public static void main(String[] args)
{
	 Car c=new Car("pqr");
}
}
