package com.jspiders.methodoverriding;
class Whatsapp1
{
   void deliveryReport()
   {
	   System.out.println("sent");
   }
}
class Whatsapp2 extends Whatsapp1
{
	@Override
    void deliveryReport()
    {
    	System.out.println("sent-deliverd");
    }
}
class Whatsapp3 extends Whatsapp2
{
	@Override
   void deliveryReport()
   {
	   System.out.println("send-delivery-send");
   }
}
public class MainClass5 {
       public static void main(String[] args) {
		    Whatsapp1   w1;
		    
		    w1=new Whatsapp1();
		    w1.deliveryReport();
		    
		    w1=new Whatsapp2();
		    w1.deliveryReport();
		    
		    w1=new Whatsapp3();
		    w1.deliveryReport();
	}
}
