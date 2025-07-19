package com.jspiders.thisandsuperkeyword;
class Product
{
  int pid;
  void displayProductId()
  {
	  int pid=402;
	  System.out.println(pid);
	  System.out.println(this.pid);
  }
  Product(int pid)
  {
	  this.pid=pid;
  }
}
public class MainClass2 
{
  public static void main(String[] args)
  {
	  Product p1=new Product(101);
	  p1.displayProductId();
  }
}
