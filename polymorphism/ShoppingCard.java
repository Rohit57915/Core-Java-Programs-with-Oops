package com.jspiders.polymorphism;

public class ShoppingCard 
{
   static void CardPyment(Card c)
   {
	   if(c!=null)
	   {
		   c.swipe();
	   }
   }
}
