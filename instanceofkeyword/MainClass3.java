package com.jspiders.instanceofkeyword;

public class MainClass3 
{
 public static void main(String[] args)
  {
	 ManualTestig mt=new ManualTestig();
	 FireFlink.runTest(mt);
	
	AutomationTesting at=new AutomationTesting();
	FireFlink.runTest(at);
  }
}
