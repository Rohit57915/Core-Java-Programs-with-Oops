package com.jspiders.inheritance;
class Alpha
{
  void play()	
  {
	  System.out.println("Excuating play method....");
  }
}
class Beta extends Alpha
{
	void run()
	{
		System.out.println("Excuating run method....");
	}
}
public class MainClass6 
{
     public static void main(String[] args)
     {
	     Alpha a1=new Alpha();
	     a1.play();
	     Beta a2=new Beta();
	     a2.play();
	     a2.run(); 
	}
}
