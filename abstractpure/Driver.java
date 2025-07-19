package com.jspiders.abstractpure;

public interface Driver {
     void register();
}
class FireFox implements Driver
{
   @Override
public void register() {
	// TODO Auto-generated method stub
	System.out.println("Connected to FireFox");
}	
}
class Chrome implements Driver
{
  @Override
public void register() {
	// TODO Auto-generated method stub
	System.out.println("Connected to chrome");
}	
}
class EdgeDriver implements Driver
{
    @Override
    public void register() {
    	// TODO Auto-generated method stub
    	System.out.println("Connected to EdgeDriver");
    }	
}
