package com.jspiders.constructorchanning;
  class Hotel{
	  Hotel(int a)
	  {
		  System.out.println("Dominoes");
	  }
	  Hotel(double d)
	  {
		  this(10);
		  
		  System.out.println("KFC");
	  }
	  Hotel(String s)
	  {
		  this(4.5);
		  System.out.println("McDonalds");
	  }
  }
  
public class MainClass1 
{
public static void main(String[] args) 
{
	Hotel h1=new Hotel("ABC");
}
}
