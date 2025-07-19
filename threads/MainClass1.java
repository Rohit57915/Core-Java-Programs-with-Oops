package com.jspiders.threads;
class DemoThread extends Thread
{
   @Override
   public void run()
   {
	  for(int a=1; a<=5; a++)
	  {
		  System.out.println("DemoThread........");
	  }
   }
}
public class MainClass1 {
public static void main(String[] args) {
	System.out.println("Program Start");    
	DemoThread dt=new DemoThread();
	dt.start();
	for(int a=1; a<=5; a++)
	{
		System.out.println("MainThread.........");
	}
	System.out.println("Program Ends");
   }
}
