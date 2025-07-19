package com.jspiders.methodoverloading;
class Demo
{
   void test(int a)
   {
	   System.out.println("Smoke Testing");
   }
   void test(double d)
   {
	   System.out.println("Adhoc Testing");
   }
   void test(String s)
   {
	   System.out.println("Performance Testing");
   }
}
public class MainClass1 
{
     public static void main(String[] args)
     {
		Demo ref=new Demo();
		ref.test(10);
		ref.test(4.5);
		ref.test("Java");
	}
}
