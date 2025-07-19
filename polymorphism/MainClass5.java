package com.jspiders.polymorphism;

public class MainClass5 
{
  public static void main(String[] args) 
  {
	  Card ref;
	  ref=new CreditCard();
	  ref.swipe();
	  
	  ref=new DebitCard();
	  ref.swipe();
	  
	  //Recommended
	  ShoppingCard.CardPyment(new CreditCard());
	  ShoppingCard.CardPyment(new DebitCard());
  }
}
