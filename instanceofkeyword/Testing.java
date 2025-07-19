package com.jspiders.instanceofkeyword;

class Testing 
{
  void report()
  {
	  System.out.println("Execuating report().....");
  }
}
class ManualTestig extends Testing
{
   void testcase()
   {
	   System.out.println("Execuatoing testcase()......");
   }
}
class AutomationTesting extends Testing
{
    void testscript()
    {
    	System.out.println("Execuating testscript()......");
    }
}
