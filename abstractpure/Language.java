package com.jspiders.abstractpure;

public interface Language {
   void write();
}
class Kannada implements Language
{
    @Override
    public void write() {
    	// TODO Auto-generated method stub
    	System.out.println("Kannada");
    }	
}
class Hindi implements Language
{
   @Override
public void write() {
	// TODO Auto-generated method stub
	System.out.println("Hindi");
}	
}
class English implements Language
{
   @Override
public void write() {
	// TODO Auto-generated method stub
	System.out.println("English");
}	
}
