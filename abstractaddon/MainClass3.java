package com.jspiders.abstractaddon;
 @FunctionalInterface
 interface Delta
 {
	 void test();
	
 }
 class Example implements Delta
 {
	 @Override
	 public void test()
	 {
		 System.out.println("Execuating test().....");
	 }
 }
public class MainClass3 {
    public static void main(String[] args) {
		     Delta obj=new Example();
		     obj.test();
	}
}
