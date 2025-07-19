package com.jspiders.methodoverloading;
class Example
{
   void play(int a,String s)
   {
	   System.out.println("Cricket");
   }
   void play(String s,int a)
   {
	   System.out.println("Foot Ball");
   }
}
public class MainClass3 
{
 public static void main(String[] args)
 {
         Example ex=new Example();
         ex.play(10, "Abc");
         ex.play("Abc", 10);
 }
}
