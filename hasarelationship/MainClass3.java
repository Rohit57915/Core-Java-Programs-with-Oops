package com.jspiders.hasarelationship;
class Camera
{
  void takephoto()
  {
	  System.out.println("Using Camera for photo");
  }
}
class SimCard
{
   void Call()
   {
	   System.out.println("Calling with SimCard");
   }
}
class Mobile
{
    Camera cam=new Camera();
    SimCard sim=new SimCard();
}
public class MainClass3 
{
  public static void main(String[] args) 
  {
	  Mobile m1=new Mobile();
	  m1.cam.takephoto();
	  m1.sim.Call();
  }
}
