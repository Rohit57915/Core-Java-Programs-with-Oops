package com.jspiders.methodoverloading;
class Launchar
{
  void launch(int a)
  {
	  System.out.println("chrome");
  }
  void launch(double d)
  {
	  System.out.println("Fire fox");
  }
  void lanch(String s)
  {
	  System.out.println("Safari");
  }
}
public class MainClass6 
{
 public static void main(String[] args) 
  {
	Launchar ref=new Launchar();
	ref.launch(45);
	ref.launch(8.9);
	ref.lanch("ABC");
  }
}
