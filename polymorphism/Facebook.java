package com.jspiders.polymorphism;

class Facebook 
{
    void display()
    {
    	System.out.println("Show UserInterface");
    }
}
class FacebookMobile extends Facebook
{
   @Override
   void display()
   {
	   System.out.println("Display in Mobile App");
   }
}
class FacebookWebsite extends Facebook
{
       @Override
       void display()
       {
    	   System.out.println("Display in Computer Browser");
       }
}
