package com.jspiders.methodoverloading;
class Sample
{
  void disp(int a)
  {
	  System.out.println("Qspiders");
  }
  void disp(int a,int b)
  {
	  System.out.println("Jspiders");
  }
  void disp(int a,int b,int c)
  {
	  System.out.println("Pyspiders");
  }
}
public class MainClass2 
{
  public static void main(String[] args)
  {
	  Sample obj=new Sample();
	  obj.disp(15);
	  obj.disp(15,13);
	  obj.disp(15, 13, 18);
  }
}
