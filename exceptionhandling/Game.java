package com.jspiders.exceptionhandling;

public class Game
{
  int hiScore=1000;
  public static void main(String[] args) {
	   Game original=new Game();
	   original.hiScore=5000;
	   
	   try {
		   Game copy=(Game)original.clone();
		   System.out.println(copy.hiScore);
	   }
	   catch(CloneNotSupportedException e){
		   System.out.println("Clone Operation Faield");
	   }
}
}

