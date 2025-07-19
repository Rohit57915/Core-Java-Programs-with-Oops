package com.jspiders.filehandling;

import java.io.PrintWriter;

import java.io.IOException;

public class MainClass11
{
  public static void main(String[] args) {
	    PrintWriter ref=null;
	    try {
	    	ref=new PrintWriter("c:/FILEIO/writer.txt");
	    	ref.println("Qspiders") ;
	    	ref.println("Software Testing");
	    	ref.println("Jspiders");
	    	ref.println("Java Development");
	    	ref.println(65);
	    	ref.println(3.5);
	    	ref.println(false);
	    	ref.flush();
	       System.out.println("Write Completed");			
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	ref.close();
	    }
  }
}
