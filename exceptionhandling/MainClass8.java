package com.jspiders.exceptionhandling;
class CustomException extends Exception
{
  CustomException()
  {
	  
  }
  CustomException(String str)
  {
	  super(str);
  }
}
class Trigger
{
   static void verify(int num) throws CustomException
   {
	   if(num%2==0&&num%5==0)
	   {
		   throw new CustomException("/By 2 and 5");
	   }
   }
}
public class MainClass8
{
  public static void main(String[] args) {
	  try {
		  Trigger.verify(20);
		  System.out.println("All is well");
	  }
	  catch(CustomException e)
	  {
		  e.printStackTrace();
	  }
}
}
