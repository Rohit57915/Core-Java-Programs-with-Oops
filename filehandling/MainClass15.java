package com.jspiders.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainClass15 {
 public static void main(String[] args) {
	   FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   
	   try {
		   fis=new FileInputStream("c:/FILEIO/repository.txt");
		   ois=new ObjectInputStream(fis);
		   Employee emp=(Employee)ois.readObject();
		   System.out.println(emp.eid);
		   System.out.println(emp.ctc);
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	   finally {
		   try {
			   ois.close();
			   fis.close();
		   }
		   catch(IOException e)
		   {
			   e.printStackTrace();
		   }
	   }
 	 }
}
