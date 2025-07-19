package com.jspiders.objectclass;
class Mobile
{
  long imei=154845877541L;
  @Override
  public boolean equals(Object obj)
  {
	  Mobile m=(Mobile)obj;
	  if(this.imei==m.imei)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
}
public class MainClass4 
{
  public static void main(String[] args)
  {
	 Mobile m1=new Mobile();
	 Mobile m2=new Mobile();
	 System.out.println(m1.equals(m2));
  }
}
