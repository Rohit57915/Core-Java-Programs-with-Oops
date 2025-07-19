package com.jspiders.thisandsuperkeyword;
class Demo
{
	  void test()
      {
    	  System.out.println("Execuating test()......");
    	  System.out.println(this);
      }	
}
public class MainClass1 
{
      public static void main(String[] args)
      {
		 Demo d1=new Demo();
		 d1.test();
		 Demo d2=new Demo();
		 d2.test();
		 Demo d3=new Demo();
		 d3.test();
	  }
}
