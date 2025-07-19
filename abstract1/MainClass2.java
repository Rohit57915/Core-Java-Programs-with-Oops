package com.jspiders.abstract1;
abstract class Alpha
{
    abstract void play();
    void run() {
    	System.out.println("Excuating run.....");
    }
}
class Beta extends Alpha
{
  @Override
void play() {
	// TODO Auto-generated method stub
	System.out.println("Excuating play.....");
}	
}
public class MainClass2 {
     public static void main(String[] args) {
		Alpha obj=new Beta();
		obj.play();
		obj.run();
	}
}
