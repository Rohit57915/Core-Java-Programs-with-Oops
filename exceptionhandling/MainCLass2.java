package com.jspiders.exceptionhandling;

public class MainCLass2 
{

	public static void main(String[] args) {
		  System.out.println("Program Starts");
 		  String str="Java";
		  try {
			  System.out.println(str.charAt(2));
		  }
		  catch(StringIndexOutOfBoundsException e){
			  System.out.println("Invalid Index");
		  }
		  catch(NullPointerException e){
			  System.out.println("Access with null reference");
		  }
		  System.out.println("Program Ends");
	}
}
