package com.jspiders.abstract1;
abstract class Android
{
    void Services()
    {
    	System.out.println("Network Services");
    }
    abstract void ui();
}
class Samsung extends Android
{
    @Override
    void ui() {
    	// TODO Auto-generated method stub
    	System.out.println("Galaxy OS");
    }	
}
class Vivo extends Android
{
  @Override
void ui() {
	// TODO Auto-generated method stub
	System.out.println("Funtouch OS");
}	
}
class Oppo extends Android
{
  @Override
void ui() {
	// TODO Auto-generated method stub
	System.out.println("Color OS");
}	
}
