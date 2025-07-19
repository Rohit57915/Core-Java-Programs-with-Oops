package com.jspiders.downcasting;
  class Demo
  {
	  
  }
  class Sample extends Demo
  {
	  
  }
public class MainClass1 {
  public static void main(String[] args) {
	   Demo ref=new Sample();
	   Sample obj=(Sample)ref; //DownCasting : Demo........>
	   System.out.println(ref);
	   System.out.println(obj);
}
}
