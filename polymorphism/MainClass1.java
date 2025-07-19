package com.jspiders.polymorphism;
class Flipkart
{
    void payment()

    {
    	System.out.println("COD");
    }
    void payment(long card)
    {
    	System.out.println("10% Discount on card");
    }
    void payment(String upi)
    {
    	System.out.println("Assuerd 20% cashback");
    }
}
public class MainClass1 {
   public static void main(String[] args) {
	   Flipkart ref=new Flipkart();
	   
	   ref.payment();
	   ref.payment(545544845485484L);
	   ref.payment("Pavan@123");
}
}
