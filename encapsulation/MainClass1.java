package com.jspiders.encapsulation;

public class MainClass1 {
      public static void main(String[] args) {
		  Person p1=new Person();
		  p1.setAge(25);
		  System.out.println(p1.getAge());
		  
		  Person p2=new Person();
		  p2.setAge(35);
		  System.out.println(p2.getAge());
	}
}
