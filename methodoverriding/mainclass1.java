package com.jspiders.methodoverriding;
class Demo
{
   void play()
   {
	   System.out.println("PUBG");
   }
}
class Sample extends Demo
{
	@Override
   void play()	
   {
	   System.out.println("BGMI");
   }
}
public class mainclass1 {
      public static void main(String[] args) 
      {
		Demo ref=new Demo();
		ref.play();
		Sample obj=new Sample();
		ref.play();
		Demo dem=new Sample();
		dem.play();
	}
}
