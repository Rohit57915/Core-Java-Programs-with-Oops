package com.jspiders.objectclass;
class Connection
{
   @Override
   protected void finalize()
   {
	   System.out.println("Relasing locked resou.....");
   }
   Connection()
   {
	   System.out.println(".................");
   }
}

public class MainClass5 {
public static void main(String[] args) {
	 Connection con=new Connection();
	 System.gc();
	 con=null;
	 System.out.println(".................");
	 System.gc();
}
}
