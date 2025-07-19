package com.jspiders.filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass22 {
	 public static void main(String[] args) {
		    BufferedWriter ref=null;
		    try {
		    	ref=new BufferedWriter(new FileWriter("c:/Task/Tools.txt"));
		    	ref.write("Selenium") ;
		    	ref.newLine();
		    	ref.write("UFT");
		    	ref.newLine();
		    	ref.write("Appium");
		    	ref.newLine();
		    	ref.write("Playwright");
		    	ref.newLine();
		    	ref.write("Cypress");
		    	
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

