package com.jspiders.instanceofkeyword;

public class MainClass1 
{
  public static void main(String[] args)
  {
	Tester t1=new Tester();
	Manager.assignWork(t1);
	
	Developer div=new Developer();
	Manager.assignWork(div);
  }
}
