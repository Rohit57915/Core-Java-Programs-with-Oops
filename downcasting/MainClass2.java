package com.jspiders.downcasting;
class Alpha
{
  int x=100;	
}
class Beta extends Alpha
{
  int y=20;	
}
public class MainClass2 {
public static void main(String[] args) {
	     Alpha ref=new Beta();
	     System.out.println(ref.x);
	     
	     Beta obj=(Beta)ref;
	     System.out.println(obj.x);
	     System.out.println(obj.y);
}
}
