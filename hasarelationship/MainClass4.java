package com.jspiders.hasarelationship;
class Department
{
   void teach()
   {
	   System.out.println("Teaching Subject");
   }
}
class Student
{
   void learn()
   {
	   System.out.println("Learning Subject");
   }
}
class College
{
   Student s1=new Student();
   Department d1=new Department();
}
public class MainClass4 
{
 public static void main(String[] args) 
 {
     College col=new College();
     col.d1.teach();
     col.s1.learn();
 }
}
