package com.jspiders.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass9
{
  public static void main(String[] args) {
	    FileWriter ref=null;
	    try {
	    	ref=new FileWriter("c:/FILEIO/writer.txt,true");
	    	ref.write("java") ;
	    	ref.write("\n");
	    	ref.write("sql");
	    	ref.write("\n");
	    	ref.write("65");
	    	ref.write("\n");
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
