package com.jspiders.thisandsuperkeyword;
class FacebookOld
{
   void reaction()
   {
	   System.out.println("Execuating reaction().....");
   }
}

class Facebook extends FacebookOld
{
   @Override
   void reaction()
   {
	   super.reaction();
	   System.out.println("Love");
	   System.out.println("haha");
	   System.out.println("Angry");
   }
}

public class MainClass4 
{
   public static void main(String[] args) 
   {
	   FacebookOld f1=new Facebook();  // Polymorphism: Parent reference, Child object
	  f1.reaction();
   }
}
