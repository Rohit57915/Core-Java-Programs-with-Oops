package com.jspiders.hasarelationship;
class Engine
{
  void power()
  {
	  System.out.println("Engine 120cc");
  }
}
class Driver
{
    void driver()
    {
    	System.out.println("Driver is Driving Vichel");
    }
}
class Car 
{
   Engine eng=new Engine(); // car Has-A Engine : Composition
   Driver dr=new Driver();  // car Has-A Driver : Aggregation
}
public class MainClass2 
{
  public static void main(String[] args) 
  {
	  Car c1=new Car();
	  c1.eng.power();
	  c1.dr.driver();
  }
}
