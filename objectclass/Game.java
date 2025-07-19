package com.jspiders.objectclass;
public class Game implements Cloneable
{
   int hiScore=1000;
   
   public static void main(String[] args) throws CloneNotSupportedException
   {
   	Game original=new Game();
   	original.hiScore=100;
   	
   	Game ref=(Game)original.clone();
   	System.out.println(ref.hiScore);
   	
   }

}
