package com.jspiders.exceptionhandling;

public class Game1 
{
       int hiScore=1000;
          static void createCopy() throws CloneNotSupportedException
          {
        	 Game1 original=new Game1();
        	 original.hiScore=5000;
        	 Game copy=(Game)original.clone();
        	 System.out.println(copy.hiScore);
          }
          public static void main(String[] args)
          {
        	  try {
        		  createCopy();
        	  }
        	  catch(CloneNotSupportedException e)
        	  {
        		  System.out.println("clone operation failed");
        	  }
          }
}
