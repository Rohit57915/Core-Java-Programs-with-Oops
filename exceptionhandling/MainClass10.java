package com.jspiders.exceptionhandling;
class OverSpeedException extends RuntimeException
{
	OverSpeedException()
	{
		
	}
	OverSpeedException(String str)
	{
		super(str);
	}
}
class Police
{
     static void checkSpeed(int Speed)
     {
    	 if(Speed>80)
    	 {
    		 throw new OverSpeedException("Speed of Vechile is " +Speed+ " Pay Fine");
    	 }
     }
}
public class MainClass10 {
  public static void main(String[] args) {
	   try {
		   Police.checkSpeed(50);
		   Police.checkSpeed(70);
		   Police.checkSpeed(90);
	   }
	   catch(OverSpeedException e)
	   {
		   e.printStackTrace();
	   }
}
}
