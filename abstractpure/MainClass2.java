package com.jspiders.abstractpure;
interface Delta
{
	void play();
}
interface Omega
{
    void help();	
}
class Example implements Delta,Omega
{
  @Override
  public void play()
  {
	  System.out.println("Execuating play.....");
  }
  @Override
  public void help()
  {
	  System.out.println("Execuating help....");
  }
}
public class MainClass2 {
  public static void main(String[] args) {
	   Example obj=new Example();
	   obj.play();
	   obj.help();
}
}
