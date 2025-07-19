package com.jspiders.abstractpure;

public interface Container {
  void store();
}
class Bottle implements Container
{
   @Override
public void store() {
	// TODO Auto-generated method stub
	System.out.println("Store Liquid");
}	

}
class Box implements Container
{
  @Override
public void store() {
	// TODO Auto-generated method stub
	  System.out.println("Store Solid");
}	
}
class Bag implements Container
{
      @Override
    public void store() {
    	// TODO Auto-generated method stub
    	System.out.println("Store Item");
    }	
}
