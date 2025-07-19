package com.jspiders.methodoverriding;
class Window10
{
   void startMenu()
   {
	   System.out.println("List View");
   }
}
class Window11 extends Window10
{
	@Override
   void startMenu()
   {
	   System.out.println("Floating Window");
   }
}
public class MainClass6 {
   public static void main(String[] args) {
	      
	   Window10 w10=new Window10();
	   w10.startMenu();
	   
	   Window11 w11=new Window11();
	   w11.startMenu();
	   
	   Window10 w=new Window11();
	   w.startMenu();
}
}
