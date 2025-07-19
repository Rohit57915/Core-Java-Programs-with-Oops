package com.jspiders.threads;
class SampleThread implements Runnable
{
  public void run()
  {
	  for(int x=1;x<=5;x++)
	  {
		  System.out.println("SampleThread.........");
	  }
  }
 }
public class MainClass2 {
   public static void main(String[] args) {
	 System.out.println("Program Starts");
	 SampleThread st=new SampleThread();
	 Thread th=new Thread(st);
	 th.start();
	 for(int x=1; x<=5; x++)
	 {
		 System.out.println("MainThread............");
	 }
	 System.out.println("Program Ends");
  }
}
