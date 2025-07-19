package com.jspiders.abstractpure;
class Alpha
{
   void run()
   {
	   System.out.println("Execuating run....");
   }
}
interface Beta
{
  void push();
 
}
class Gamma extends Alpha implements Beta
{
  
   @Override
public void push() {
	// TODO Auto-generated method stub
	System.out.println("Exceuating push.....");
}
}
public class MainClass3 {
     public static void main(String[] args) {
		    Gamma obj=new Gamma();
		    obj.run();
		    obj.push();
	}
}
