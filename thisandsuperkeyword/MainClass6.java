package com.jspiders.thisandsuperkeyword;
class Delta
{
   int val=30;	
}
class Example extends Delta
{
   int val=60;
   void run()
   {
	   int val=90;
	   System.out.println(val);
	   System.out.println(this.val);
	   System.out.println(super.val);
   }
}
public class MainClass6 
{
   public static void main(String[] args) 
   {
	   Example ex=new Example();
	   ex.run();
   }
}
