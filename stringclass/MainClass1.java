package com.jspiders.stringclass;

public class MainClass1 {
  public static void main(String[] args) {
	  String s1="Qspiders";
	  System.out.println(s1.toString());
	  
	  String s2="a";
	  System.out.println(s2.hashCode());
	  
	  String s3="Testing";
	  String s4=new String("Testing");
	  System.out.println(s3.equals(s4));
}
}
