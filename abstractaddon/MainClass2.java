package com.jspiders.abstractaddon;
interface Alpha
{
  default void play()	
  {
	  System.out.println("Excecuating paly.....");
  }
}
class Beta implements Alpha
{
	
}
public interface MainClass2 {
  public static void main(String[] args) {
	   Alpha ref=new Beta();
	   ref.play();
	   ref.play();
}     
}
