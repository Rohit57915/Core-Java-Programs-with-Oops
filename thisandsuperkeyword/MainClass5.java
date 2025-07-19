
package com.jspiders.thisandsuperkeyword;
class Alpha 
{
  void report()
  {
	  System.out.println("Execuating report().....");
  }
}
class Beta extends Alpha
{
     void test()
     {
    	 System.out.println("Execuating test().......");
    	 super.report();
     }
}
public class MainClass5 
{
  public static void main(String[] args) {
	  
	  Beta b1=new Beta();
	  b1.test();
}
}
