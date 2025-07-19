package com.jspiders.filehandling;

import java.io.File;

public class MainClass18 {
	public static void main(String[] args) {
		   File ref= new File("C:/Task");
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
