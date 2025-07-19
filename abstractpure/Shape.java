package com.jspiders.abstractpure;

interface Shape 
{
  void draw();
}
class Circle implements Shape
{
   @Override
   public void draw()
   {
	   System.out.println("Drawing Circle");
   }
}
class Triangle implements Shape
{
	
  @Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing Triangle");
}	
}
class Square implements Shape
{
  @Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing Square");
}	
}
