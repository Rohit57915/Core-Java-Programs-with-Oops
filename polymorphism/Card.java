package com.jspiders.polymorphism;

class Card 
{
    void swipe()
    {
    	System.out.println("Please wait");
    }
}
class CreditCard extends Card
{
     @Override
     void swipe()
     {
    	 System.out.println("Balance Inceases");
     }
}
class DebitCard extends Card
{
  @Override
  void swipe()
  {
	  System.out.println("Balance Decrease");
  }
}