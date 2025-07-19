package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class MainClass17 {
  public static void main(String[] args) {
	  File ref=new File("c:/FILEIO/permission.txt");
		 boolean flag=ref.exists();
		 if(flag==false)
		 {
			 try
		 {
				 ref.createNewFile();
			 System.out.println("File Created ");
			 ref.setReadable(false);
			 ref.setWritable(false);
			 ref.setExecutable(false);
			 System.out.println("Permission Assigned");
			 
		 }
			 catch(IOException e) {
				 e.printStackTrace();
			 }
	   }  
  }
}
