package com.jspiders.thisandsuperkeyword;
class Utility
{
   void test()
   {
	   System.out.println("Executing test().....");
   }
   void disp()
   {
	   System.out.println("Executing disp().....");
   }
   void play()
   {
	   System.out.println("Execuating play()....");
	   this.disp();
	   this.test();
   }
}
public class MainClass3 
{
   public static void main(String[] args) 
   {
	   Utility obj=new Utility();
	   obj.play();
   }
}
