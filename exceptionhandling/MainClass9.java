package com.jspiders.exceptionhandling;
class InvalidMobileNumberException extends Exception
{
	InvalidMobileNumberException()
	{
		
	}
	InvalidMobileNumberException(String str)
	{
		super(str);
	}
}
class MobileNumberVerifier
{
   	static void verifyMobileNumber(String Mobile) throws InvalidMobileNumberException
   	{
   		if(Mobile.length()!=10)
   		{
   			throw new InvalidMobileNumberException("Invalid Mobile Number");
   		}
   	}
}
public class MainClass9 
{
  public static void main(String[] args) {
	
	  try {
		  MobileNumberVerifier.verifyMobileNumber("123456789");
	  }
	  catch(InvalidMobileNumberException e)
	  {
		  e.printStackTrace();
	  }
}
}
