package com.jspiders.constructorchanning;
 class Demo
 {
	 Demo()
	 {
		 System.out.println("Demo() constructor");
	 }
 }
 class Sample extends Demo
 {
	 Sample()
	 {
		 super();
		 System.out.println("Sample() constructor");
	 }
 }
public class MainClass6 
{
public static void main(String[] args)
{
	Sample s=new Sample();
}
}
