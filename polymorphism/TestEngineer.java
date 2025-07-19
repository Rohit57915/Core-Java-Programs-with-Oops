package com.jspiders.polymorphism;

class TestEngineer 
{
  void test()
  {
	  System.out.println("I am TestEngineer");
  }
}
class ManualTesting extends TestEngineer
{
  void test()
  {
	  System.out.println("Mannual Testing");
  }
}
class AutomationTesting extends TestEngineer
{
	void test()
	{
		System.out.println("Automation Testing");
	}
}