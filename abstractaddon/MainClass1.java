package com.jspiders.abstractaddon;
interface Demo
{
	 static void test()
	    {
	    	System.out.println("Execuating test....");
	    }	
}
public interface MainClass1 {
   public static void main(String[] args) {
	  Demo.test();
}
}
