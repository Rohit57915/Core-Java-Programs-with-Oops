package com.jspiders.inheritance;

class Instagram
{
	void post()
	{
		System.out.println("posting....");
	}
}
class InstagramNew extends Instagram
{
  void messenger()
  {
	  System.out.println("Messenger...");
  }
}

public class MainClass4 
{
public static void main(String[] args)
{
	Instagram i1=new Instagram();
	i1.post();
	InstagramNew i2=new InstagramNew();
	i2.post();
	i2.messenger();
}
}
