package com.jspiders.exceptionhandling;
class PinCheckedException extends Exception
{
	PinCheckedException()
	{
		
	}
	PinCheckedException(String str)
	{
		super(str);
		
	}
}
class PinValidation
{
  static void checkedPin(int pin) throws PinCheckedException
  {
	  if(pin!=6)
	  {
		  throw new PinCheckedException("Pin Invalid");
	  }
  }
}
public class MainClass12 {
  public static void main(String[] args) {
	   
	  try {
		  PinValidation.checkedPin(5);
	  }
	  catch(PinCheckedException e)
	  {
		  e.printStackTrace();
	  }
}
}
