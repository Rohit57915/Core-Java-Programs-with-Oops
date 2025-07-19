package com.jspiders.methodoverloading;
class Irctc
{
  void search(String src,String des)
  {
	  System.out.println("Search with Source and Destination");
  }
  void search(int trainNumber)
  {
	  System.out.println("Search with train Number");
  }
  void search(String pnr)
  {
	  System.out.println("Seacrch with PNR");
  }
}
public class MainClass5 
{
 public static void main(String[] args) 
 {
	Irctc obj=new Irctc();
	obj.search("KSR", "MAS");
	obj.search(12061);
	obj.search("J123456");
  }
}
