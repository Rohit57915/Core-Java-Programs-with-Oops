package com.jspiders.constructorchanning;
class Student
{
    Student()
    {
    	System.out.println("code to initialization personal information");
    	System.out.println("code to initialization acadmic information");
    }
    Student(int a)
    {
    	this();
    	System.out.println("code to initialization experience information");
    }
}
public class MainClass5
{
public static void main(String[] args) 
{
	Student s=new Student(6);
}
}
