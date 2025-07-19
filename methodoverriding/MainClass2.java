package com.jspiders.methodoverriding;
class Parent
{
void marriage()
{
  System.out.println("Arrenge Marriage");	
}
}
class Child extends Parent
{
    @Override
    void marriage()
    {
    	System.out.println("Love Marriage");
    }
}
public class MainClass2 {
   public static void main(String[] args) {
	   Parent pr=new Parent();
	   pr.marriage();
	   Child ch=new Child();
	   ch.marriage();
	   Parent p=new Child();
	   p.marriage();
}
}
