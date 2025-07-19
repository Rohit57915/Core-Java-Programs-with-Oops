package com.jspiders.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class MainClass14 {
 public static void main(String[] args) {
	  BufferedReader ref=null;
	  try {
		  ref=new BufferedReader(new FileReader("c:/FILEIO/readme.txt"));
		  String val=ref.readLine();
		  while(val!=null) {
			  System.out.println(val);
			  val=ref.readLine();
		  }
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	  finally {
		  try {
			  ref.close();
			  
		  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
	  }
}
}
