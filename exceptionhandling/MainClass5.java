package com.jspiders.exceptionhandling;

public class MainClass5 
{
  public static void main(String[] args)
  {
	  try {
		  System.out.println("try Starts");
		  System.out.println(10/0);
		  System.out.println("try ends");
	  }
	  catch(ArithmeticException e){
		  System.out.println("/By Zero");
	  }
	  finally {
		  System.out.println("Excuating finally");
	  }
  }
}
