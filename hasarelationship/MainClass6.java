package com.jspiders.hasarelationship;
class Printer
{
   void print()
   {
	   System.out.println("Printer is printing");
   }
}
class Computer
{
  static Printer out=new Printer();	
}
public class MainClass6 
{
  public static void main(String[] args) 
  {
	  Computer.out.print();
  }
}
