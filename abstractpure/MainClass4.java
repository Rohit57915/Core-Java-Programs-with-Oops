package com.jspiders.abstractpure;
interface Helper 
{
   void help();	
}
interface Giver extends Helper
{
  void give();	
}
class Utility implements Giver
{
  @Override
    public void give()
    {
	  System.out.println("Execuating give....");
    }
  @Override
  public void help()
  {
	  System.out.println("Execuating help....");
  }
}
public class MainClass4 {
  public static void main(String[] args) {
	   Utility obj=new Utility();
	   obj.help();
	   obj.give();
}
}
