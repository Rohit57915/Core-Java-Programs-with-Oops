package com.jspiders.filehandling;

import java.io.File;

public class MainClass5 
{
	static void display(File ref)
	{
		boolean flag=ref.exists();
		if(flag==true) {
			String location=ref.getAbsolutePath();
			System.out.println(location);
		}
	}
  public static void main(String[] args) {
	    File f1=new File("c:/FILEIO/Demo.txt");
	    display(f1);
}
}
