package com.jspiders.filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass10
{
  public static void main(String[] args) {
	    BufferedWriter ref=null;
	    try {
	    	ref=new BufferedWriter(new FileWriter("c:/FILEIO/writer.txt"));
	    	ref.write("java") ;
	    	ref.newLine();
	    	ref.write("sql");
	    	ref.newLine();
	    	ref.write("65");
	    	ref.newLine();
	    	char[] ch= {'T','e','s','t','i','n','g'};
	    	ref.write(ch);
	    	ref.flush();
	       System.out.println("Write Completed");			
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	try {
	    		ref.close()	 ;
	    		}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
  }
}
