package com.jspiders.inheritance;
class AdobeFree
{
 void read()	
 {
	 System.out.println("Free features...");
 }
}
class AdobePaid extends AdobeFree
{
  void edit()
  {
	  System.out.println("Edit features....");
  }
}
public class MainClass2 
{
     public static void main(String[] args)
     {
		AdobeFree free=new AdobeFree();
		free.read();
		AdobePaid paid=new AdobePaid();
		paid.read();
		paid.edit();
	}
}
