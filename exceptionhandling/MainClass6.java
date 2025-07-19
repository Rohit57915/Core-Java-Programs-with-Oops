package com.jspiders.exceptionhandling;

class Ray
{
  void test()
  {
	  System.out.println("Execuating test()......");
  }
}
public class MainClass6
{
	 static void instantiate() throws ClassNotFoundException,IllegalAccessException,InstantiationException
	 {
		 Ray d=(Ray)Class.forName("package com.jspiders.exceptionhandling,Demo").newInstance();
		 d.test();
	 }
	 public static void main(String[] args)
	 {
		 try {
			 instantiate();
			 }
		 catch(ClassNotFoundException e)
		 {
			System.out.println("No such class Exists");
		 }
		 catch(IllegalAccessException e)
		 {
			 System.out.println("Access Denied");
		 }
		 catch(InstantiationException e)
		 {
			 System.out.println("Object Created Failed");
		 }
	 }
}
