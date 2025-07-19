package com.jspiders.methodoverriding;
class ScriptV1
{
  void execute()
  {
	  System.out.println("Execuating Scenario Manually");
  }
}
class ScriptV2 extends ScriptV1
{
	@Override
   void execute()
   {
	   System.out.println("Execuating Scenario using Automation");
   }
}
public class MainClass7 {
   public static void main(String[] args) {
	      ScriptV1 s1=new ScriptV1();
	      s1.execute();
	      
	      ScriptV2 s2=new ScriptV2();
	      s2.execute();
	      
	      ScriptV1 s3=new ScriptV2();
	      s3.execute();
}
}
