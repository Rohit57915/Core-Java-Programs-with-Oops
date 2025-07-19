package com.jspiders.constructorchanning;
 class Alpha
 {
	 int a;
	 Alpha()
	 {
		a=100; 
	 }
 }
 class Beta extends Alpha
 {
	 int b;
	 Beta()
	 {
		 b=200;
	 }
 }
public class MainClass7 
{
  public static void main(String[] args) {
	Beta ref=new Beta();
	System.out.println(ref.a);
	System.out.println(ref.b);
}
}
