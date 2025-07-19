package com.jspiders.polymorphism;

public class MainClass6 
{
  public static void main(String[] args)
   {
	   /* TestEngineer ref;
	    ref=new ManualTesting();
	    ref.test();
	    
	    ref=new AutomationTesting();
	    ref.test();*/
	    
	    //Recommended
	    TestEngine.runTest(new ManualTesting());
	    TestEngine.runTest(new AutomationTesting());
	 
	   
   }
}
