package com.jspiders.inheritance;

class Demo 
{
          int a=10;
          void test()
          {
        	  System.out.println("Exacuating test...");
          }
}
class Sample extends Demo
{
	
}
public class MainClass1
{
	public static void main(String[] args)
	{
		Sample ref=new Sample();
		System.out.println(ref.a);
		ref.test();
	}
}