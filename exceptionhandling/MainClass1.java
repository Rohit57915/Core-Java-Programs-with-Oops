package com.jspiders.exceptionhandling;

public class MainClass1 
{
  public static void main(String[] args) 
  {
	 System.out.println("Program Start");
	 
	 try {
		 System.out.println(10/2);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println( "/By Zero");
	 }
	 System.out.println("Program ends");
  }
}
