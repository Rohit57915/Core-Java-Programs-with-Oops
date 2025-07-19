package com.jspiders.filehandling;

import java.io.File;

public class MainClass4 {
 public static void main(String[] args) {
	     File ref=new File("c:/FILEIO/Demo.txt");
	     boolean flag=ref.exists();
	     if(flag==true)
	     {
	    	 long count=ref.length();
	    	 System.out.println("Count : "+count);
	    }
	     else {
	    	 System.out.println("Not Found");
	     }
  }
}
