package com.jspiders.polymorphism;

public class Mainclass4 
{
 public static void main(String[] args) 
   {
	  Facebook fb;
	  fb=new FacebookMobile();
	  fb.display();
	  fb=new FacebookWebsite();
	  fb.display();
	  
	  //Recommended
	  DisplayAdapter.adapt(new FacebookMobile());
	  DisplayAdapter.adapt(new FacebookWebsite());
   }       
}
