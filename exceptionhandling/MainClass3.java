package com.jspiders.exceptionhandling;
abstract class Demo
{
   void test()
   {
	   System.out.println("Execuating test()......");
   }
}
public class MainClass3 {
  public static void main(String[] args) {
	  
	  try {
		  Demo d=(Demo)Class.forName("com.jspiders.exceptionhandling").newInstance();
				  d.test();
	  }
	  catch(ClassNotFoundException e) {
		  System.out.println("No such class Exists");
	  }
	  catch(IllegalAccessException e)
	  {
		  System.out.println("Access Denied");
	  }
	  catch(InstantiationException e)
	  {
		System.out.println("Object Creation Failed");  
	  }

  }
}
