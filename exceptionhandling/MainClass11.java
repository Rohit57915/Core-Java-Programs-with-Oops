package com.jspiders.exceptionhandling;
class LowBatteryException extends Exception
{
	LowBatteryException()
	{
		
	}
	LowBatteryException(String str)
	{
		super(str);
	}
}
class BatteryMonitor
{
  static void checkBattery(int level) throws LowBatteryException
  {
	  if(level<20)
	  {
		  throw new LowBatteryException("Battery% is " +level);
	  }
  }
}
public class MainClass11 {
  public static void main(String[] args) {
	   
	  try {
		  BatteryMonitor.checkBattery(18);
	  }
	  catch(LowBatteryException e)
	  {
		  e.printStackTrace();
	  }
}
}
