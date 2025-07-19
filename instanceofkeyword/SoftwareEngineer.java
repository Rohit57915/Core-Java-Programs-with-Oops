package com.jspiders.instanceofkeyword;

class SoftwareEngineer 
{
   void meeting()
   {
	System.out.println("Exceuating meeting().......");   
   }
}
class Developer extends SoftwareEngineer
 {
	void coding()
	{
		System.out.println("Execuating coding().....");
	}
}
class Tester extends SoftwareEngineer
{
      void testing()
      {
    	  System.out.println("Execuating testing()....");
      }
}