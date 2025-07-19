package com.jspiders.filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass21 {
	 public static void main(String[] args) {
		    BufferedWriter ref=null;
		    try {
		    	ref=new BufferedWriter(new FileWriter("c:/Task/Language.txt"));
		    	ref.write("java") ;
		    	ref.newLine();
		    	ref.write("Python");
		    	ref.newLine();
		    	ref.write("C");
		    	ref.newLine();
		    	ref.write("c++");
		    	ref.newLine();
		    	ref.write("C#");
		    	ref.newLine();
		    	ref.write("perl");
		    	ref.newLine();
		    	ref.write("JAVA");
		    	
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
