package com.jspiders.inheritance;
class Script1
{
void excuteTest()	
{
System.out.println("Excuatin Testing...");	
}
}
class Script2 extends Script1
{
   void generatereport()	
   {
	   System.out.println("Generate report....");
   }
}
public class MainClass5 
{
     public static void main(String[] args) 
     {
        		Script1 s1=new Script1();
        		s1.excuteTest();
        		Script2 s2=new Script2();
        		s2.excuteTest();
        		s2.generatereport();
	}
}
