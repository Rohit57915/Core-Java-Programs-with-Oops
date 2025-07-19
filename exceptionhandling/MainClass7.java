package com.jspiders.exceptionhandling;

public class MainClass7 
{
   public static void main(String[] args) 
   {
	 try {
		 String str=null;
		 System.out.println(str.charAt(3));
	 }
	 catch(NullPointerException e)
	 {
		 String msg=e.getMessage();
		 System.out.println(msg);
		 e.printStackTrace();
	 }
  }
}
