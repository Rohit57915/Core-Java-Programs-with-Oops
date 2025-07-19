package com.jspiders.abstractpure;

public interface color 
{
      void file();
}
class Red implements color
{
   @Override
public void file() {
	// TODO Auto-generated method stub
	System.out.println("Red color");
}	
}
class Blue implements color
{
  @Override
public void file() {
	// TODO Auto-generated method stub
   System.out.println("Blue color");	
}	
}
class Green implements color
{
   @Override
public void file() {
	// TODO Auto-generated method stub
    System.out.println("Green color");	
}	
}
