package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;
//CREATE A FILE
public class MainClass2 {
 public static void main(String[] args) {
	File ref=new File("c:/FILEIO/Demo.txt");
	boolean flag=ref.exists();
	if(flag==false)
	{
		try {
			ref.createNewFile();
			System.out.println("File Created");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	else {
		System.out.println("FILE EXISTS");
	}
  }
}
