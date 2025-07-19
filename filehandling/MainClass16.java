package com.jspiders.filehandling;

import java.io.File;

public class MainClass16 {
 public static void main(String[] args) {
	 File ref=new File("c:/FILEIO/Help.txt");
	 boolean flag=ref.exists();
	 if(flag==true)
	 {
		 System.out.println("Readable : "+ref.canRead());
		 System.out.println("Writable :  "+ref.canWrite());
		 System.out.println("Execuatable : "+ref.canExecute());
	 }
   
 }
}
