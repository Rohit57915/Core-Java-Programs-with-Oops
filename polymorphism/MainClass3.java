package com.jspiders.polymorphism;
class Irctc
{
   void search(String src,String dest)
   {
	   System.out.println("Route Details");
   }
   void search(int trainNumber)
   {
	   System.out.println("Train Details");
   }
   void search(String pnr)
   {
	   
	   System.out.println("Ticket Details");
   }
   
}
public class MainClass3 {
  public static void main(String[] args) {
	      Irctc t1=new Irctc();
	      t1.search("Rohit", "Roy");
	      t1.search(15425);
	      t1.search("Rama");
}
}
