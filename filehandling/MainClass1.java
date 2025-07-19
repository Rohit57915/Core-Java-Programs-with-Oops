package com.jspiders.filehandling;

import java.io.File;
//CREATE A FOLDER
public class MainClass1 {
 public static void main(String[] args) {
	   File ref= new File("c:/FILEIO");
	   boolean flag=ref.exists();
	   if(flag==false)
	   {
		   ref.mkdir();
		   System.out.println("Folder Created");
	   }
	   else
	   {
		   System.out.println("Folder Exists");
	   }
  }
}
