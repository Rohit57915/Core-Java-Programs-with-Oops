package com.jspiders.hasarelationship;
class Demo
{
   void test()
   {
	   System.out.println("Execuating test()......");
   }
}
class Sample
{
    Demo d=new Demo();	
}
public class MainClass1
{
  public static void main(String[] args)
  {
	  Sample s1=new Sample();
	  s1.d.test();
   }
}
