package com.jspiders.objectclass;
class Student1
{
   String name="Rohit";
}
class Student2
{
  String name="Raghaw";
 @Override
  public String toString()
 {
	 return"Student Name : " +name;
 }
}
public class MainClass1 
{
   public static void main(String[] args)
   {
	  Student1 s1=new Student1();
	  System.out.println(s1);
	  Student2 s2=new Student2();
	  System.out.println(s2);
   }
}
