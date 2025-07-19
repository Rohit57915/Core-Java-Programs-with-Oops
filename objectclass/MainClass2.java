package com.jspiders.objectclass;
class Employee1
{
  int pid=101;	
}
class Employee2
{
  int pid=101;
  @Override
  public int hashCode()
  {
	  return pid;
  }
}

public class MainClass2 
{
public static void main(String[] args)
{
     Employee1 e1=new Employee1();
     System.out.println(e1.hashCode());
     Employee2 e2=new Employee2();
     System.out.println(e2.hashCode());
    		 
}
}
