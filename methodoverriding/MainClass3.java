package com.jspiders.methodoverriding;
class Father
{
   void motercycle()
   {
	   System.out.println("Normal Stock");
   }
}
class Gunda extends Father
{
   @Override
   void motercycle()
   {
	   System.out.println("Abnormal stock");
   }
}
public class MainClass3 {
       public static void main(String[] args) {
    	   
		   Father f=new Father();
		   f.motercycle();
		   Gunda g=new Gunda();
		   g.motercycle();
		   Father fg=new Gunda();
		   fg.motercycle();
	}
}
