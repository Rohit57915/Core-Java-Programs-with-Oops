package com.jspiders.downcasting;
class A
{
    void test()	
    {
	  System.out.println("test......");
    }
}
class B extends A
{
     void disp()
   {
	System.out.println("disp,,,,,,,");
   }
}
class C extends B
{
    void play()	
     {
	 System.out.println("play.........");
     }
}
public class MainClass3 {
public static void main(String[] args) {
	  A a1=new C();
	  a1.test();
	  
	  B b1=(B)a1;
	  b1.test();
	  b1.disp();
	  
	  C c1=(C)b1;
	  c1.test();
	  c1.disp();
	  c1.play();
	  
	  C c2=(C)a1;
	  c2.test();
	  c2.disp();
	  c2.play();
	  
}
}
