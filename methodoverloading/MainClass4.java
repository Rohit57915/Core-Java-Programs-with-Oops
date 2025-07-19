package com.jspiders.methodoverloading;
class Flipkart
{
   void payment()
   {
	   System.out.println("COD");
   }
   void payment(long card)
   {
	   System.out.println("CARD");
   }
   void payment(String upi)
   {
	   System.out.println("UPI");
   }
}
public class MainClass4
{
  public static void main(String[] args) 
  {
	 Flipkart obj=new Flipkart();
	 obj.payment();
	 obj.payment(45454544);
	 obj.payment("pavan@sbi");
  }
}
