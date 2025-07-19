package com.jspiders.polymorphism;
 class TestScript
 {
	 void test(int a)
	 {
		 System.out.println("Sanity Testing");
	 }
	 void test(double d)
	 {
		 System.out.println("Ad Hoc Testing");
	 }
	 void test(String s)
	 {
		 System.out.println("Regression testing");
	 }
	 
 }
public class MainClass2 {
  public static void main(String[] args) {
	      TestScript ts=new TestScript();
	      
	      ts.test(5);
	      ts.test(5.6);
	      ts.test("abc");
}
}
